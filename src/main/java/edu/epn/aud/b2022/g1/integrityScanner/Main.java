package edu.epn.aud.b2022.g1.integrityScanner;

import java.sql.SQLException;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Main {

    static Function<Object,Object> identity = t->t;
    
    public static void main(String[] args) {
        new GUILogin().setVisible(true);        
    }
    
}
