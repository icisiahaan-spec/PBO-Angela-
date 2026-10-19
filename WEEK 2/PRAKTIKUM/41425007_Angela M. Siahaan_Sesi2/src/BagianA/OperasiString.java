/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

import java.util.Scanner;

/**
 *
 * @author icisi
 */
public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        // .length() adalah method bawaan String untuk menghitung jumlah karakter
        // (termasuk spasi juga ikut dihitung sebagai karakter)
        System.out.println("Panjang string: " + nama.length());

        // .charAt(index) mengambil satu karakter pada posisi tertentu
        // penomoran posisi dimulai dari 0, jadi charAt(0) = karakter paling pertama
        System.out.println("Huruf pertama: " + nama.charAt(0));

        // .contains("...") mengecek apakah string mengandung teks tertentu di dalamnya
        // hasilnya berupa true/false, bukan angka
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

// Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
// length() akan ikut menghitung spasi-spasi berlebih sebagai karakter, sehingga 
// jumlah karakter yang ditampilkan lebih besar dari jumlah huruf sebenarnya.