/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_keuangan_wildan;

/**
 *
 * @author asrul
 */
public abstract class Rekening implements FinancialServices {
    protected String accountNumber;
    protected double balance;
    protected String accountType;

    public Rekening(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
}
    public abstract double calculateInterest();

    public String getAccountDetails() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Type: " + accountType + "\n" +
               "Balance: " + balance;
    }
}
