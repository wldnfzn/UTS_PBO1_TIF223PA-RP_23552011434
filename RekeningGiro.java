/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_keuangan_wildan;

/**
 *
 * @author asrul
 */
public class RekeningGiro extends Rekening {
    private double monthlyInterestRate = 0.01;

    public RekeningGiro(String accountNumber, double balance) {
        super(accountNumber, balance, "Giro");
    }

    @Override
    public double calculateInterest() {
        return balance * monthlyInterestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Giro. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Giro. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
