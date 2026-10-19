/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

import java.util.Scanner;

/**
 *
 * @author icisi
 */

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14; // final = nilai tetap, tidak boleh diubah

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        // Validasi: jari-jari tidak boleh negatif secara fisik
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}