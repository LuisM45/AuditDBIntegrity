package edu.epn.aud.b2022.g1.integrityScanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class IntegrityManager {
    private static IntegrityManager conexionBD = null;
    
    private final String host;
    private final String port;
    private final String schema;
    
    private final String username;
    private final String password;
    
    public Connection connection;

    private IntegrityManager(String host, String port, String schema, String username, String password) throws SQLException {
        this.host = host;
        this.port = port;
        this.schema = schema;
        this.username = username;
        this.password = password;
        setConnection();
    }
    
    public static IntegrityManager getConnection(String host, String port, String schema, String username, String password) throws SQLException{
        if(conexionBD == null) conexionBD = new IntegrityManager(host, port, schema, username, password);
        if(!conexionBD.equals(host, port, schema, username, password)){
            conexionBD.connection.close();
            conexionBD = new IntegrityManager(host, port, schema, username, password);
        }
        
        return conexionBD;
    }
    
    private void setConnection() throws SQLException {
        String connectionUrl =
                "jdbc:sqlserver://" + host +":"+port+";"+
                "database="+schema+";"+
                "user="+username+";"+
                "password="+password+";"+
                "trustServerCertificate=false;"+
                "loginTimeout=10;";

        connection = DriverManager.getConnection(connectionUrl);
    }
    
    public List<String> getConstraints() throws SQLException{
        String query =
                "SELECT name FROM sys.check_constraints " +
                "UNION " +
                "SELECT name FROM sys.foreign_keys; ";
        Statement stmt = this.connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        List<String> constraints = new LinkedList<>();
        while(rs.next()){
            constraints.add(rs.getString("name"));
        }
        stmt.close();
        rs.close();
        
        return constraints;
    }
    
    public List<DatefulAnomaly> getDatefulAnomalies() throws SQLException{
        String query = "DBCC CHECKCONSTRAINTS WITH ALL_CONSTRAINTS";
        Statement stmt = this.connection.createStatement();
        
        List<DatefulAnomaly> datefulAnomalies = new LinkedList<>();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String table = rs.getString("Table");
            String constraint = rs.getString("Constraint");
            String where = rs.getString("Where");
            datefulAnomalies.add(new DatefulAnomaly(table,constraint,where));
        }
        rs.close();
        stmt.close();
        
        return datefulAnomalies;
    }

    public List<DatefulAnomaly>getDatelessAnomalies() throws SQLException{
        String query =
                "DECLARE @PKs TABLE (                                                 "+
                "    pk_name nvarchar(1024),                                          "+
                "    column_names nvarchar(1024),                                     "+
                "    table_name nvarchar(1024)                                        "+
                "    )                                                                "+
                "                                                                     "+
                "INSERT INTO @PKs                                                     "+
                "SELECT                                                               "+
                "    pk.name AS pk_name,                                              "+
                "    substring(column_names, 1, len(column_names)-1) AS columns,      "+
                "    tab.name AS table_name                                           "+
                "FROM sys.tables tab INNER JOIN sys.indexes pk                        "+
                "    ON tab.object_id = pk.object_id                                  "+
                "    AND pk.is_primary_key = 1                                        "+
                "CROSS APPLY(                                                         "+
                "    SELECT col.name + ', '                                           "+
                "        FROM sys.index_columns ic INNER JOIN sys.columns col         "+
                "            ON ic.object_id = col.object_id                          "+
                "            AND ic.column_id = col.column_id                         "+
                "        WHERE ic.object_id = tab.object_id                           "+
                "            AND ic.index_id = pk.index_id                            "+
                "        ORDER BY col.column_id                                       "+
                "        for xml path('')                                             "+
                "    ) D (column_names)                                               "+
                "                                                                     "+
                "SELECT pk_name, column_names, table_name                             "+
                "FROM @PKs maj                                                        "+
                "CROSS APPLY(                                                         "+
                "    SELECT count(*)                                                  "+
                "    FROM @PKs min                                                    "+
                "    WHERE maj.column_names = min.column_names                        "+
                ") D (coincidences)                                                   "+
                "WHERE coincidences >1                                                ";
        Statement stmt = this.connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        List<DatefulAnomaly> datelessAnomalies = new LinkedList<>();
        while (rs.next()) {
            String table = rs.getString("table_name");
            String constraint = rs.getString("pk_name");
            String where = rs.getString("column_names");
            datelessAnomalies.add(new DatefulAnomaly(table,constraint,where));
        }
        rs.close();
        stmt.close();
        
        return datelessAnomalies;
    }


    public List<Trigger> getTriggers() throws SQLException{
        String query = 
                "SELECT                                                "+
                "    trig.name AS trigger_name,                        "+
                "    trig.is_disabled AS is_disabled,                  "+
                "    evnt.type_desc AS type_desc,                      "+
                "    tabl.name AS table_name                           "+
                "FROM Sys.Triggers trig INNER JOIN Sys.Tables tabl     "+
                "        ON trig.Parent_id = tabl.Object_Id            "+
                "    INNER JOIN Sys.Events evnt                        "+
                "        ON evnt.object_id = trig.object_id            "+
                "WHERE trig.is_ms_shipped = 0                          ";
        
        Statement stmt = this.connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        List<Trigger> triggers = new LinkedList<>();
        while(rs.next()){
            String name = rs.getString("trigger_name");
            String table = rs.getString("table_name");
            boolean isEnabled = !rs.getBoolean("is_disabled");
            Trigger.Type triggerType = Trigger.Type.valueOf(rs.getString("type_desc"));
            
            triggers.add(new Trigger(name,table,isEnabled,triggerType));
        }
        stmt.close();
        rs.close();
        
        return triggers;
    }
    
    public void writeConstraintsLog(String filepath) throws IOException, SQLException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"constraints.log"));){
            for(String constraint: getConstraints()){
                bw.write(constraint);
                bw.write("\n");
            }
            bw.write(filepath);
        }
    }
    
    public void writeDatefulAnomaliesLog(String filepath) throws IOException, SQLException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"dateful_anomalies.log"));){
            for(DatefulAnomaly anomaly: getDatefulAnomalies()){
                String newLine = List.of(anomaly.constraint,anomaly.table,anomaly.where)
                        .stream()
                        .collect(Collectors.joining(",", "", "\n"));
                bw.write(newLine);
            }
        }
    }
    public void writeDatelessAnomaliesLog(String filepath) throws IOException, SQLException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"dateless_anomalies.log"));){
            for(DatefulAnomaly anomaly: getDatelessAnomalies()){
                String newLine = List.of(anomaly.constraint,anomaly.table,anomaly.where)
                        .stream()
                        .collect(Collectors.joining(",", "", "\n"));
                bw.write(newLine);
            }
        }
    }
    public void writeTriggersLog(String filepath) throws IOException, SQLException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"dateless_anomalies.log"))){
            for(Trigger trigger: getTriggers()){
                String newLine = List.of(trigger.name,trigger.table,trigger.isEnabled,trigger.triggerType)
                        .stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(",", "", "\n"));
                bw.write(newLine);
            }
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof IntegrityManager)) return false;
        
        IntegrityManager other = (IntegrityManager)obj;
        if(!this.host.equals(other.host)) return false;
        if(!this.port.equals(other.port)) return false;
        if(!this.schema.equals(other.schema)) return false;
        if(!this.username.equals(other.username)) return false;
        if(!this.password.equals(other.password)) return false;
        return true;
    }
    
    private boolean equals(String host, String port, String schema, String username, String password) {
        if(!this.host.equals(host)) return false;
        if(!this.port.equals(port)) return false;
        if(!this.schema.equals(schema)) return false;
        if(!this.username.equals(username)) return false;
        if(!this.password.equals(password)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.host);
        hash = 67 * hash + Objects.hashCode(this.port);
        hash = 67 * hash + Objects.hashCode(this.schema);
        hash = 67 * hash + Objects.hashCode(this.username);
        hash = 67 * hash + Objects.hashCode(this.password);
        return hash;
    }
    
    
    
}

