package edu.epn.aud.b2022.g1.integrityscanner;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
//        try {
//            IntegrityManager im = IntegrityManager.getConnection("127.0.0.1", "1433", "pubs", "sa", "win10123!");
//            System.out.println(im.getAllColumns());
//            System.out.println(im.getAllPKColumns());
//            System.out.println(im.getAllFKColumns());
//            System.out.println(im.getFalseFKs());
//            System.out.println(im.getIsolatedTables());
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        new GUILogin().setVisible(true);        
    }
    
}
