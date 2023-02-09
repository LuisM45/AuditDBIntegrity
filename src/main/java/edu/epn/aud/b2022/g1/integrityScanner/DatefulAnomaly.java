package edu.epn.aud.b2022.g1.integrityScanner;

public class DatefulAnomaly {
    public final String table;
    public final String constraint;
    public final String where;

    public DatefulAnomaly(String table, String constraint, String where) {
        this.table = table;
        this.constraint = constraint;
        this.where = where;
    }

    @Override
    public String toString() {
        return "DatefulAnomaly{" + "table=" + table + ", constraint=" + constraint + ", where=" + where + '}';
    }
}
