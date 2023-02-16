package edu.epn.aud.b2022.g1.integrityscanner;

public class DatalessAnomaly {
    public final String table;
    public final String constraintExpected;
    public final String description;

    public DatalessAnomaly(String table, String constraintExpected ,String description) {
        this.table = table;
        this.constraintExpected = constraintExpected;
        this.description = description;
    }

    @Override
    public String toString() {
        return "DatalessAnomaly{" + "table=" + table + ", constraintExpected=" + constraintExpected + ", description=" + description + '}';
    }
    
}
