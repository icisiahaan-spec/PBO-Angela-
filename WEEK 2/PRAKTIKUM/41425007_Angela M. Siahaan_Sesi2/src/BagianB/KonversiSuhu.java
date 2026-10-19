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

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konversi Celsius ke Fahrenheit
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " C = " + fahrenheit + " F");

        // Konversi Fahrenheit ke Celsius
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        // printf dipakai supaya hasil desimal dibatasi 2 angka di belakang koma
        System.out.printf("%.1f F = %.2f C%n", f, c);
    }
}
