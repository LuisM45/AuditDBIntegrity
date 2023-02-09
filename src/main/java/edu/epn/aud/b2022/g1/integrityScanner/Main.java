package edu.epn.aud.b2022.g1.integrityScanner;

import java.sql.SQLException;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Main {

    static Function<Object,Object> identity = t->t;
    
    public static void main(String[] args) {
        try {
            DBConection dbc = DBConection.getConnection("127.0.0.1", "1433", "pubs", "sa", "win10123!");
            Stream.of(
                    dbc.getConstraints(),
                    dbc.getDatefulAnomalies(),
                    dbc.getDatelessAnomalies_(),
                    dbc.getTriggers_()
                ).flatMap(t->t.stream())
                .forEach(System.out::println);
            
            System.out.println();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
//        new GUILogin().setVisible(true);        
    }
    
}
