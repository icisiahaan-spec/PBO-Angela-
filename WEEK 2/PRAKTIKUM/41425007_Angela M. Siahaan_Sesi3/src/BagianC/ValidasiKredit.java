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
public class ValidasiKredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String input = scanner.nextLine();

        // replace("-", "") menghapus semua tanda hubung, supaya format dengan atau tanpa "-" bisa diproses sama
        String nomorBersih = input.replace("-", "");

        boolean valid = true;
        String pesanError = "";

        // Syarat 1: panjang harus tepat 16 digit (setelah tanda hubung dihapus)
        if (nomorBersih.length() != 16) {
            valid = false;
            pesanError = "Harus 16 digit.";
        }
        // Syarat 2: harus diawali angka 4, 5, atau 6
        else if (!(nomorBersih.startsWith("4") || nomorBersih.startsWith("5") || nomorBersih.startsWith("6"))) {
            valid = false;
            pesanError = "Harus dimulai dengan 4, 5, atau 6.";
        }
        // Syarat 3: semua karakter (setelah "-" dihapus) harus berupa angka
        else {
            for (int i = 0; i < nomorBersih.length(); i++) {
                if (!Character.isDigit(nomorBersih.charAt(i))) {
                    valid = false;
                    pesanError = "Hanya boleh berisi angka dan tanda hubung.";
                    break;
                }
            }
        }

        if (valid) {
            System.out.println("Nomor kartu valid.");
        } else {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println(pesanError);
        }
    }
}