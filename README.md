UTS Pemrograman Berorientasi Obyek 1

•	Mata Kuliah: Pemrograman Berorientasi Obyek 1

•	Dosen Pengampu: Muhammad Ikhwan Fathulloh

Profil

•	Nama: Wildan Fauzan

•	NIM: 23552011434

•	Studi Kasus: Aplikasi Manajemen Keuangan

Judul Studi Kasus

	“ Implementasi Konsep OOP dalam Aplikasi Manajemen Keuangan Menggunakan Java “

Penjelasan 4 pilar OOP dalam Studi Kasus
1.	Inheritance
   
•	Konsep:

Inheritance memungkinkan sebuah kelas mewarisi atribut dan metode dari kelas induk.

•	Penerapan dalam Studi Kasus:

a.	Kelas Rekening adalah kelas induk yang memiliki atribut umum seperti accountNumber, balance, dan accountType.

b.	Kelas RekeningTabungan dan RekeningGiro adalah kelas turunan yang mewarisi semua atribut dan metode dari Rekening.

c.	Dengan inheritance, kita dapat menambahkan logika khusus untuk setiap jenis rekening di kelas turunannya tanpa mengulangi kode yang sudah ada di kelas induk.

2. Encapsulation

•	Konsep:

Encapsulation adalah melindungi data dengan cara membatasi akses langsung ke atribut melalui penggunaan metode getter dan setter.

•	Penerapan dalam Studi Kasus:

a.	Pada kelas Transaksi, atribut seperti accountNumber, date, amount, dan type tidak dapat diakses langsung dari luar kelas.

b.	Pengguna hanya bisa mengakses data ini melalui metode yang aman, seperti toString() untuk menampilkan transaksi.

3. Polymorphism
   
•	Konsep:

Polymorphism memungkinkan metode yang sama memiliki implementasi berbeda di kelas yang berbeda.

•	Penerapan dalam Studi Kasus:

a.	Metode calculateInterest() adalah metode abstrak di kelas induk Rekening.

b.	Kelas turunan seperti RekeningTabungan dan RekeningGiro mengimplementasikan metode ini dengan cara berbeda.

c.	RekeningTabungan menghitung bunga berdasarkan saldo harian.

d.	RekeningGiro menghitung bunga berdasarkan saldo bulanan.

e.	Saat calculateInterest() dipanggil, aplikasi akan memilih implementasi yang sesuai berdasarkan objeknya.

4.	Abstract
    
•	Konsep:

Abstract adalah menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas penting kepada pengguna.

•	Penerapan dalam Studi Kasus:

a.	Interface FinancialService berfungsi sebagai kontrak yang mendefinisikan metode deposit() dan withdraw().

b.	Kelas seperti RekeningTabungan dan RekeningGiro mengimplementasikan metode ini sesuai kebutuhan masing-masing.

c.	Dengan abstraksi, pengguna hanya perlu tahu bahwa semua jenis rekening dapat melakukan setor dan tarik, tanpa perlu tahu detail implementasinya.

DEMO PROYEK

GITHUB : https://github.com/wldnfzn/UTS_PBO1_TIF223PA-RP_23552011434

YOUTUBE
