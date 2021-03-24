package com.example.interfaceprograms;

public class BankAccount implements Measurable{
    private double balance;
    private int accountNumber;
    private static int lastAssignedNuber = 1000;

    public BankAccount(double balance) {
        this.balance = balance;
        lastAssignedNuber++;
        accountNumber = lastAssignedNuber;
    }

    public double getMeasure() {
        return balance;
    }
}
