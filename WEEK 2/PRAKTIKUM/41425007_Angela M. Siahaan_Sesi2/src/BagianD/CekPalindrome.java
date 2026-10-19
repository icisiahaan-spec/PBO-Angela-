/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

import java.util.Scanner;

/**
 *
 * @author icisi
 */
public class CekPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        // toLowerCase() mengubah semua huruf jadi huruf kecil,
        // supaya "Katak" dan "katak" dianggap sama saat dibandingkan
        String kataLower = kata.toLowerCase();

        // StringBuilder adalah "alat" untuk memanipulasi teks, salah satunya membalik urutan huruf
        // .reverse() membalik urutan karakter dalam teks
        // .toString() mengubah hasilnya kembali jadi tipe String biasa
        String kataTerbalik = new StringBuilder(kataLower).reverse().toString();

        // Palindrome = kata yang sama persis jika dibaca dari depan maupun dari belakang
        boolean isPalindrome = kataLower.equals(kataTerbalik);

        if (isPalindrome) {
            System.out.println("\"" + kata + "\" adalah palindrome.");
        } else {
            System.out.println("\"" + kata + "\" bukan palindrome.");
        }

        // Menghitung jumlah huruf vokal (a, i, u, e, o) dalam kata
        int jumlahVokal = 0;
        for (int i = 0; i < kataLower.length(); i++) {
            char huruf = kataLower.charAt(i);
            // Mengecek apakah karakter saat ini termasuk salah satu huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                jumlahVokal++; // tambah 1 setiap kali ketemu huruf vokal
            }
        }
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }
}

