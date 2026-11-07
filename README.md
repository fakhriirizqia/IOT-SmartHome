# Sistem Pengendali Perangkat Smart Home Berbasis IoT

## Identitas Mahasiswa
- Nama: [Isi nama]
- NIM: [Isi NIM]
- Tema: IoT (digit terakhir NIM 4 atau 5)

## Deskripsi Program
Program Java sederhana untuk mensimulasikan pengendalian perangkat rumah pintar (Smart Home). Perangkat yang digunakan adalah lampu pintar dan kipas pintar. Pengguna dapat menyalakan, mematikan, serta melihat informasi perangkat.

Program ini merupakan simulasi menggunakan Java dan belum terhubung dengan perangkat IoT fisik.

## Daftar File
- `PerangkatIoT.java`: abstract superclass.
- `LampuPintar.java`: subclass lampu.
- `KipasPintar.java`: subclass kipas.
- `BisaDikontrol.java`: interface untuk mengontrol perangkat.
- `BisaTerhubungInternet.java`: interface untuk koneksi internet.
- `Main.java`: class utama untuk menjalankan program.

## Cara Compile
Buka terminal pada folder yang berisi seluruh file Java, kemudian jalankan:

```bash
javac *.java
```

## Cara Menjalankan

```bash
java Main
```

## Konsep PBO yang Digunakan
1. **State dan Behavior:** atribut perangkat dan method untuk mengubah status serta menampilkan informasi.
2. **Immutability:** konstanta `NAMA_SISTEM` dan atribut `idPerangkat` yang bertipe `private final`.
3. **Enkapsulasi dan Overloading:** atribut dibuat `private`, disediakan getter dan setter untuk atribut yang dapat diubah, serta dua variasi konstruktor.
4. **Inheritance:** `LampuPintar` dan `KipasPintar` mewarisi `PerangkatIoT`.
5. **Super Chaining:** konstruktor subclass memanggil `super(...)`, dan method `tampilkanInfo()` memanggil `super.tampilkanInfo()`.
6. **Method Overriding:** subclass menimpa method `ubahStatus()` dan `tampilkanInfo()`.
7. **Abstract Class:** `PerangkatIoT` merupakan abstract class dengan abstract method `ubahStatus()`.
8. **Logika State Percabangan:** method `ubahStatus()` menggunakan if/else untuk mengubah status perangkat.
9. **Polimorfisme Interface:** variabel `BisaDikontrol` dan `BisaTerhubungInternet` digunakan untuk menyimpan objek subclass.
10. **Multiple Interface:** `LampuPintar` mengimplementasikan `BisaDikontrol` dan `BisaTerhubungInternet`.

## Screenshot Output
Tambahkan screenshot hasil program setelah menjalankan perintah `java Main` pada bagian ini.
