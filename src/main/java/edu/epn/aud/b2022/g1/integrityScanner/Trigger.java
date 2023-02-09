/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.epn.aud.b2022.g1.integrityScanner;


public class Trigger {
    public final String name;
    public final String table;
    public final boolean isEnabled;
    public final TriggerType triggerType;

    public Trigger(String name, String table, boolean isEnabled, TriggerType triggerType) {
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
