package edu.epn.aud.b2022.g1.integrityScanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConection {
    private static DBConection conexionBD = null;
    
    private final String host;
    private final String port;
    private final String schema;
    
    private final String username;
    private final String password;
    
    public Connection connection;

    private DBConection(String host, String port, String schema, String username, String password) throws SQLException {
        this.host = host;
        this.port = port;
        this.schema = schema;
        this.username = username;
        this.password = password;
        setConnection();
    }
    
    public static DBConection getConnection(String host, String port, String schema, String username, String password) throws SQLException{
        if(conexionBD == null) conexionBD = new DBConection(host, port, schema, username, password);
        if(!conexionBD.equals(host, port, schema, username, password)){
            try {
                conexionBD.connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConection.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexionBD = new DBConection(host, port, schema, username, password);
        }
        
        return conexionBD;
    }
    
    private void setConnection() throws SQLException {
        String connectionUrl = "jdbc:sqlserver://" + host +":"+port+";"
                + "database="+schema+";"
                + "user="+username+";"
                + "password="+password+";"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";

        connection = DriverManager.getConnection(connectionUrl);
    }

    public ArrayList <String> getReferentialIntegrityList(){
        try{
            String SQL = "SELECT name FROM sys.check_constraints " +
                        "UNION " +
                        "SELECT name FROM sys.foreign_keys;";
            Statement stmt = this.connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            ArrayList<String> listaIntRef = new ArrayList<>();
            
            while (rs.next()) {
                listaIntRef.add(rs.getString("name"));
            }
            
            return listaIntRef;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
    public ArrayList<String[]> getDatefulAnomalies(ArrayList<String> miLista){
        try{
            
            ArrayList<String[]> listaAConDatos = new ArrayList<>();
            for(String bucle: miLista){
                String SQL = "DBCC CHECKCONSTRAINTS("+bucle+");";
                Statement stmt = this.connection.createStatement();
                try{
                    ResultSet rs = stmt.executeQuery(SQL);
                    while (rs.next()) {
                        String arrAux [] = new String[3];
                        arrAux[0] = rs.getString("Table");
                        arrAux[1] = rs.getString("Constraint");
                        arrAux[2] = rs.getString("Where");
                        listaAConDatos.add(arrAux);
                    }
                }catch(Exception e){
                    
                }
                
            }
            
            
            return listaAConDatos;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    public ArrayList<String[]> getDatelessAnomalies(){
        try{
            String SQL = "create view getClavesPrimarias\n" +
"	as\n" +
"	select \n" +
"		pk.[name] as pk_name,\n" +
"		substring(column_names, 1, len(column_names)-1) as [columns],\n" +
"		tab.[name] as table_name\n" +
"	from sys.tables tab\n" +
"		inner join sys.indexes pk\n" +
"			on tab.object_id = pk.object_id \n" +
"			and pk.is_primary_key = 1\n" +
"	   cross apply (select col.[name] + ', '\n" +
"						from sys.index_columns ic\n" +
"							inner join sys.columns col\n" +
"								on ic.object_id = col.object_id\n" +
"								and ic.column_id = col.column_id\n" +
"						where ic.object_id = tab.object_id\n" +
"							and ic.index_id = pk.index_id\n" +
"								order by col.column_id\n" +
"								for xml path ('') ) D (column_names)";
            Statement stmt = this.connection.createStatement();
            stmt.execute(SQL);
            
        }catch(Exception e){
            
        }
        
        try{
            
            String SQLc = "select * from getClavesPrimarias\n" +
"where columns = (select columns from getClavesPrimarias GROUP BY columns HAVING COUNT(*)>1)";
            Statement stmt = this.connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQLc);
            ArrayList<String[]> listaAnomaliasSINdatos = new ArrayList<>();
            
            while (rs.next()) {
                String arrAux []= new String[3];
                arrAux[0] = rs.getString("pk_name");
                arrAux[1] = rs.getString("columns");
                arrAux[2] = rs.getString("table_name");
                listaAnomaliasSINdatos.add(arrAux);
            }
            return listaAnomaliasSINdatos;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
         
    }
    
    
    
    
    public ArrayList<Object[]> getTriggers(){
        String SQL = ";WITH\n" +
"        TableTrigger\n" +
"        AS\n" +
"        (\n" +
"            Select \n" +
"                Sys.Tables.Name As TableName , \n" +
"                Sys.Tables.Object_Id As Table_Object_Id ,\n" +
"                Sys.Triggers.Name As Trigger_Name, \n" +
"                Sys.Triggers.Object_Id As Trigger_Object_Id \n" +
"            From Sys.Tables \n" +
"            INNER Join Sys.Triggers On ( Sys.Triggers.Parent_id = Sys.Tables.Object_Id )\n" +
"            Where ( Sys.Tables.Is_MS_Shipped = 0 )\n" +
"        ),\n" +
"  \n" +
"        AllObject\n" +
"        AS\n" +
"        (\n" +
"            SELECT * FROM TableTrigger\n" +
"        )\n" +
"\n" +
"\n" +
"    Select \n" +
"        a.Trigger_Name, a.TableName, tri.is_disabled, e.type_desc\n" +
"    From AllObject a\n" +
"	Left join sys.events e\n" +
"	ON a.Trigger_Object_Id = e.object_id\n" +
"	left join sys.triggers tri\n" +
"	ON a.Trigger_Object_Id = tri.object_id\n" +
"    Order By Trigger_Name;";
        
        try{
            Statement stmt = this.connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            ArrayList<Object[]> listaTrigg = new ArrayList<>();
            ArrayList<String> nombres = new ArrayList<>();
            while (rs.next()) {
                if(nombres.contains(rs.getString("Trigger_Name")) == false){
                    Object arrAux[] = new Object[6];
                    arrAux[0] = rs.getString("Trigger_Name");
                    arrAux[1] = rs.getString("TableName");
                    if(rs.getInt("is_disabled") == 0){
                        arrAux[2] = true;
                    }else{
                        arrAux[2] = false;
                    }
                    
                    arrAux[3] = false;
                    arrAux[4] = false;
                    arrAux[5] = false;
                    
                    if(rs.getString("type_desc").equals("INSERT")){
                        arrAux[3] = true;
                    }else if(rs.getString("type_desc").equals("UPDATE")){
                        arrAux[4] = true;
                    }else{
                        arrAux[5] = true;
                    }
                    
                    listaTrigg.add(arrAux);
                    nombres.add(rs.getString("Trigger_Name"));
  
                }else{
                    int indEnc = nombres.indexOf(rs.getString("Trigger_Name"));
                    Object auxarrr[] = listaTrigg.get(indEnc);
                    if(rs.getString("type_desc").equals("INSERT")){
                        auxarrr[3] = true;
                    }else if(rs.getString("type_desc").equals("UPDATE")){
                        auxarrr[4] = true;
                    }else{
                        auxarrr[5] = true;
                    }
                }
  
            }
            
            return listaTrigg;
                
        }catch(Exception e){
            return null;
        }
        
        
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof DBConection)) return false;
        
        DBConection other = (DBConection)obj;
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

