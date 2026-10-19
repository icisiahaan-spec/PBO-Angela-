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

public class SisaBagiPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta 2 angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        // Sisa bagi menggunakan operator %
        int sisaBagi = a % b;

        // Perpangkatan menggunakan Math.pow (hasilnya double, di-casting ke int)
        double pangkat = Math.pow(a, b);

        // Menampilkan hasil
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + (int) pangkat);
    }
}