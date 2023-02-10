package edu.epn.aud.b2022.g1.integrityscanner;


public class Trigger {
    public enum Type {INSERT,UPDATE,DELETE}
    public final String name;
    public final String table;
    public final boolean isEnabled;
    public final Type triggerType;

    public Trigger(String name, String table, boolean isEnabled, Type triggerType) {
        this.name = name;
        this.table = table;
        this.isEnabled = isEnabled;
        this.triggerType = triggerType;
    }

    @Override
    public String toString() {
        return "Trigger{" + "name=" + name + ", table=" + table + ", isEnabled=" + isEnabled + ", triggerType=" + triggerType + '}';
    }
    
    
}
