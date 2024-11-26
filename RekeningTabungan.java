/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_keuangan_wildan;

/**
 *
 * @author asrul
 */
public class RekeningTabungan extends Rekening {
    private double dailyInterestRate = 0.02;

    public RekeningTabungan(String accountNumber, double balance) {
        super(accountNumber, balance, "Tabungan");
    }

    @Override
    public double calculateInterest() {
        return balance * dailyInterestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Tabungan. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Tabungan. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
