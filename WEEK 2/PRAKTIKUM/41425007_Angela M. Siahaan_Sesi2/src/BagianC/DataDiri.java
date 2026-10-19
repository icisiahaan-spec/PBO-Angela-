/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

/**
 *
 * @author icisi
 */
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print mencetak teks tanpa pindah baris (untuk prompt input)
        System.out.print("Masukkan nama: ");
        // nextLine() membaca satu baris teks (boleh mengandung spasi)
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        // nextInt() membaca angka bulat
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        // nextDouble() membaca angka desimal
        double tinggi = input.nextDouble();

        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        // nextBoolean() membaca nilai true/false
        boolean isMahasiswa = input.nextBoolean();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        // Casting (int) membuang bagian desimal, bukan membulatkan
        // contoh: 165.8 menjadi 165, bukan 166
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}
