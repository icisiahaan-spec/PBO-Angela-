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

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));

        // (double) memaksa hasil bagi punya angka desimal, bukan dibulatkan ke int
        System.out.println("Bagi: " + ((double) a / b));

        // Modulus (%) menghasilkan SISA hasil bagi, bukan hasil baginya
        System.out.println("Modulus: " + (a % b));

        // Math.pow(x, y) menghitung x pangkat y, hasilnya selalu double
        System.out.println("Pangkat: " + Math.pow(a, b));
    }
}
