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
import java.util.Scanner; 

public class Ratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta 3 nilai ujian dari pengguna
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();

        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();

        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();

        // Menghitung rata-rata dari 3 nilai
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menampilkan hasil rata-rata
        System.out.println("Rata-rata: " + rataRata);
    }
}
    

