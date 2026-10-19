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

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Detik ke format HH:MM:SS
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = scanner.nextInt();

            int jam = totalDetik / 3600; // 1 jam = 3600 detik
            int sisaSetelahJam = totalDetik % 3600;
            int menit = sisaSetelahJam / 60; // 1 menit = 60 detik
            int detik = sisaSetelahJam % 60;

            // %02d artinya: tampilkan angka minimal 2 digit, diisi angka 0 di depan jika kurang
            System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);

        } else if (pilihan == 2) {
            // HH:MM:SS ke total detik
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = scanner.next();

            // split(":") memecah teks jadi beberapa bagian berdasarkan tanda ":"
            String[] bagian = waktu.split(":");
            int jam = Integer.parseInt(bagian[0]); // ubah teks jadi angka
            int menit = Integer.parseInt(bagian[1]);
            int detik = Integer.parseInt(bagian[2]);

            int totalDetik = (jam * 3600) + (menit * 60) + detik;
            System.out.println("Hasil: " + totalDetik + " detik");
        }
    }
}
