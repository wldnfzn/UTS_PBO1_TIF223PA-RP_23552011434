/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasi_manajemen_keuangan_wildan;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author asrul
 */
public class Main {

    private static ArrayList<Rekening> accounts = new ArrayList<>();
    private static ArrayList<Transaksi> transactions = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Aplikasi Manajemen Keuangan ===");
            System.out.println("1. Buka Rekening");
            System.out.println("2. Transaksi Keuangan");
            System.out.println("3. Hitung Bunga");
            System.out.println("4. Laporan Keuangan");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    openAccount();
                    break;
                case 2:
                    handleTransaction(); // Metode dipanggil di sini
                    break;
                case 3:
                    calculateInterest();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid!");
            }
        }
    }

    private static void handleTransaction() {
        System.out.print("Masukkan nomor rekening: ");
        String accountNumber = scanner.next();
        Rekening account = findAccount(accountNumber);

        if (account != null) {
            System.out.println("1. Setor  2. Tarik");
            int type = scanner.nextInt();
            System.out.print("Masukkan jumlah: ");
            double amount = scanner.nextDouble();

            if (type == 1) {
                account.deposit(amount);
                transactions.add(new Transaksi(accountNumber, "Today", amount, "Deposit"));
            } else if (type == 2) {
                account.withdraw(amount);
                transactions.add(new Transaksi(accountNumber, "Today", amount, "Withdraw"));
            } else {
                System.out.println("Transaksi tidak valid!");
            }
        } else {
            System.out.println("Rekening tidak ditemukan!");
        }
    }

    private static Rekening findAccount(String accountNumber) {
        for (Rekening account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    private static void openAccount() {
        System.out.print("Masukkan nomor rekening: ");
        String accountNumber = scanner.next();
        System.out.print("Masukkan saldo awal: ");
        double balance = scanner.nextDouble();
        System.out.println("Pilih jenis rekening: 1. Tabungan 2. Giro");
        int type = scanner.nextInt();

        if (type == 1) {
            accounts.add(new RekeningTabungan(accountNumber, balance));
            System.out.println("Rekening Tabungan berhasil dibuat.");
        } else if (type == 2) {
            accounts.add(new RekeningGiro(accountNumber, balance));
            System.out.println("Rekening Giro berhasil dibuat.");
        } else {
            System.out.println("Jenis rekening tidak valid!");
        }
    }

    private static void calculateInterest() {
        System.out.print("Masukkan nomor rekening: ");
        String accountNumber = scanner.next();
        Rekening account = findAccount(accountNumber);

        if (account != null) {
            double interest = account.calculateInterest();
            System.out.println("Bunga yang diperoleh: " + interest);
        } else {
            System.out.println("Rekening tidak ditemukan!");
        }
    }

    private static void generateReport() {
        System.out.print("Masukkan nomor rekening untuk laporan: ");
        String accountNumber = scanner.next();

        boolean found = false;
        System.out.println("\n=== Laporan Keuangan untuk Rekening: " + accountNumber + " ===");

        for (Transaksi transaction : transactions) {
            if (transaction.getAccountNumber().equals(accountNumber)) {
                System.out.println(transaction);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada transaksi untuk nomor rekening ini.");
        }
    }
}
