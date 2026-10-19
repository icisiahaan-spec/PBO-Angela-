/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

import java.util.Scanner;

/**
 *
 * @author icisi
 */
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Username dan password yang benar (dianggap tersimpan di sistem)
        String usernameBenar = "admin";
        String passwordBenar = "password123";

        boolean loginBerhasil = false; // penanda status login
        int percobaan = 0; // menghitung sudah berapa kali mencoba

        System.out.println("=== Sistem Login ===");

        // Perulangan maksimal 3 kali percobaan, berhenti lebih awal jika login berhasil
        while (percobaan < 3 && !loginBerhasil) {
            percobaan++; // tambah hitungan percobaan di awal setiap putaran
            System.out.println("Percobaan " + percobaan + ":");

            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            // Validasi panjang username (5-10 karakter)
            if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Username harus 5-10 karakter.");
                continue; // lewati sisa kode, lanjut ke percobaan berikutnya
            }

            // Validasi password: minimal 8 karakter dan harus ada angka di dalamnya
            boolean adaAngka = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    adaAngka = true;
                    break;
                }
            }
            if (password.length() < 8 || !adaAngka) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
                continue;
            }

            // Jika format sudah valid, baru dicek kecocokan dengan data asli
            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Login berhasil!");
                loginBerhasil = true; // menghentikan perulangan while
            } else {
                System.out.println("Login gagal! Password salah.");
            }
        }

        // Setelah keluar dari while, cek apakah gagal karena kehabisan percobaan
        if (!loginBerhasil && percobaan >= 3) {
            System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
        }
    }
}

