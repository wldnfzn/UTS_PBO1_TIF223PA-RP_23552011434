Pengertian dan Penjelasan Konsep

Studi kasus ini menggabungkan empat konsep dasar pemrograman berorientasi objek (OOP): Inheritance, Polymorphism, Encapsulation, dan Interface.

1. Inheritance (Pewarisan)
Inheritance memungkinkan kelas anak (subclass) untuk mewarisi atribut dan metode dari kelas induk (superclass).

Implementasi dalam kode:
Rekening adalah kelas induk dengan atribut umum seperti accountNumber, balance, dan accountType.
RekeningTabungan dan RekeningGiro adalah subclass yang mewarisi dari Rekening dan menambahkan logika khusus, seperti metode calculateInterest() yang berbeda untuk masing-masing jenis rekening.

2. Polymorphism
Polymorphism memungkinkan metode yang sama memiliki implementasi berbeda pada kelas yang berbeda.

Implementasi dalam kode:
Metode calculateInterest() di RekeningTabungan dan RekeningGiro memiliki logika berbeda.
Program memanggil metode yang sesuai dengan jenis rekening secara otomatis.

3. Encapsulation
Encapsulation menyembunyikan detail implementasi dan hanya memberikan akses ke data melalui metode tertentu.

Implementasi dalam kode:
Kelas Transaksi memiliki atribut date, amount, type, dan accountNumber yang hanya dapat diakses melalui konstruktor dan metode toString().

4. Interface
Interface digunakan untuk mendefinisikan kontrak metode yang harus diimplementasikan oleh kelas.

Implementasi dalam kode:
FinancialService adalah interface yang mendefinisikan metode deposit() dan withdraw().

Penjelasan Logika Program di Main.java
1. Alur Utama

Program memiliki menu utama dengan 5 pilihan:
Membuka rekening baru.
Melakukan transaksi keuangan (setor/tarik).
Menghitung bunga.
Menampilkan laporan keuangan berdasarkan nomor rekening.
Keluar dari program.
2. Daftar Rekening

Data rekening disimpan dalam ArrayList<Rekening> bernama accounts.
3. Daftar Transaksi

Semua transaksi disimpan dalam ArrayList<Transaksi> bernama transactions.

Penjelasan Per Fungsi
a. Membuka Rekening
Metode openAccount() meminta pengguna memasukkan nomor rekening, saldo awal, dan jenis rekening (Tabungan atau Giro). Kemudian, rekening baru ditambahkan ke daftar accounts.

b. Transaksi Keuangan
Metode handleTransaction() meminta nomor rekening, lalu memproses setoran atau penarikan. Catatan transaksi disimpan dalam daftar transactions.

c. Menghitung Bunga
Metode calculateInterest() meminta nomor rekening, lalu memanggil metode calculateInterest() dari objek rekening terkait.

d. Laporan Keuangan
Metode generateReport() meminta nomor rekening, lalu menampilkan transaksi yang sesuai dari daftar transactions.

Kesimpulan
Kode ini dirancang untuk:

Memisahkan tanggung jawab antar kelas (modular).
Menggunakan prinsip OOP (Inheritance, Polymorphism, Encapsulation, dan Interface).
Menyimpan data transaksi dan rekening secara terorganisir dalam daftar.
