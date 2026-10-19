/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author icisi
 */
import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        // nextLine() membaca satu baris teks yang diketik user (boleh mengandung spasi)
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        // .equals() membandingkan ISI dua String apakah sama persis
        // (bukan pakai == , karena == untuk String di Java tidak selalu akurat)
        boolean usernameValid = username.equals("admin");

        // .length() menghitung jumlah karakter dalam sebuah String
        boolean panjangValid = password.length() >= 6;

        // Variabel penanda (flag): awalnya dianggap "belum ada angka" (false),
        // nanti diubah jadi true kalau ditemukan angka di dalam password
        boolean adaAngka = false;

        // Perulangan (for) untuk memeriksa password KARAKTER PER KARAKTER
        // i mulai dari 0 sampai sebelum panjang password (i < password.length())
        for (int i = 0; i < password.length(); i++) {
            // .charAt(i) mengambil satu karakter pada posisi ke-i
            // Character.isDigit(...) mengecek apakah karakter itu berupa angka (0-9)
            if (Character.isDigit(password.charAt(i))) {
                adaAngka = true;
                break; // "break" artinya langsung keluar dari perulangan,
                       // karena sudah ketemu angka, tidak perlu cek karakter selanjutnya
            }
        }

        // && artinya "DAN" — semua kondisi di kiri-kanan harus bernilai true
        // supaya keseluruhan hasilnya true
        if (usernameValid && panjangValid && adaAngka) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }
    }
}