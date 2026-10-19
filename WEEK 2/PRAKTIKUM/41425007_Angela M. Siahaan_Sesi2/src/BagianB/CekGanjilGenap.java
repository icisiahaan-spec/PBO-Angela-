/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author icisi
 */
import java.util.Scanner; // untuk membaca input dari pengguna

public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta bilangan dari pengguna
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Operator % (modulus) menghasilkan sisa bagi
        // Jika sisa bagi dengan 2 adalah 0, berarti bilangan genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
