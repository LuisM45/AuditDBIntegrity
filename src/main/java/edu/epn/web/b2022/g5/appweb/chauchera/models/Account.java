/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.epn.web.b2022.g5.appweb.chauchera.models;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

class Account{
    private static int LAST_ID = 0;
    enum Type{INCOME,SPENDING};
    
    private final int id;
    private double balance;
    private final Set<Type> accountTypes;
    
    public Account(Type... accountTypes) {
        id = LAST_ID++;
        balance = 0;
        this.accountTypes = new HashSet(Arrays.asList(accountTypes));
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public boolean isType(Account.Type type ){
        return accountTypes.contains(type);
    }
    
    public void generate(double ammount){
        boolean isValidTransaction = this.isType(Type.INCOME);
        
        if(!isValidTransaction){
            throw new RuntimeException("Tipo de cuenta no correcto. Solamente una cuenta de ingreso puede generar ingresos.");
        }
        
        setBalance(getBalance()+ammount);
    }
    
    public void transferFrom(Account incomeAccount,double ammount){
        boolean isValidTransaction = this.isType(Type.SPENDING) && incomeAccount.isType(Type.INCOME);
        
        if(!isValidTransaction){
            throw new RuntimeException("Tipos de cuenta no correctos. La transferencia se puede realizar desde una cuenta de ingresos a una cuenta de gastos.");
        }
        
        incomeAccount.setBalance(incomeAccount.getBalance()-ammount);
        setBalance(getBalance()+ammount);
    }

    @Override
    public String toString() {
        return "AccountImplementation{" + "id=" + id + ", balance=" + balance + ", acountTypes=" + accountTypes + '}';
    }
    
}
