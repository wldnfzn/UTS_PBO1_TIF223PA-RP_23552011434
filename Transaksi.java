/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasi_manajemen_keuangan_wildan;

/**
 *
 * @author asrul
 */
public class Transaksi {
    private String accountNumber;
    private String date;
    private double amount;
    private String type;

    public Transaksi(String accountNumber, String date, double amount, String type) {
        this.accountNumber = accountNumber;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Amount: " + amount + ", Type: " + type;
    }
}
