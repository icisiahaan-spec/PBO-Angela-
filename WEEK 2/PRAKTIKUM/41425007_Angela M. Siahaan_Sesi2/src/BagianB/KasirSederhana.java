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

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print mencetak teks TANPA pindah baris (dipakai untuk prompt input)
        System.out.print("Masukkan nama barang: ");
        // nextLine() membaca satu baris teks yang diketik user
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        // nextDouble() membaca angka desimal
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        // nextInt() membaca angka bulat
        int jumlah = input.nextInt();

        // Total belanja = harga satuan dikali jumlah barang yang dibeli
        double totalSebelumDiskon = harga * jumlah;

        // Variabel diskon diawali dengan nilai 0 (anggap belum ada diskon)
        double diskon = 0;
        // Diskon 10% hanya diberikan JIKA total belanja sudah mencapai 100000 atau lebih
        if (totalSebelumDiskon >= 100000) {
            // 0.1 artinya 10% (0.1 = 10/100)
            diskon = totalSebelumDiskon * 0.1;
        }

        // Total yang harus dibayar = total awal dikurangi diskon (jika ada)
        double totalBayar = totalSebelumDiskon - diskon;

        // System.out.println mencetak teks LALU pindah baris baru
        System.out.println("Total sebelum diskon: " + totalSebelumDiskon);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);
    }
}
