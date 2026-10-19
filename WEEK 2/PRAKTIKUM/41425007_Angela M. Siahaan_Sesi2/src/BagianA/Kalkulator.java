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
        System.out.println("Bagi: " + ((double) a / b));
    }
}

// Praktek 1: Apa perbedaan nilai asli double dengan hasil casting int? 
// Boolean akan mengeuarkan hasil angka yang ikut disertai angka di belakang koma 
// Sedangkan kalau casting int itu akan memberikan hanya hasil angka bulat nya saja ,tidak termasuk angka di belakang koma 

//Praktek 2: Mengapa pembagian int perlu di-casting ke double? 
//karena supaya hasil bagi dari nilai vaariable yang tipe data nya integer itu bisa meyertakan angka di belakang koma.
//Karena kalau int hanya akan menghasil kan angka bulat . System.out.println((double) itu lah yang dimaksud dengan casting.

//Praktek 2: Apa risiko jika pembagi = 0? 
//akan jadi crash.Namun hasil run kode ini adalah infinity ,sesuai konsep pembagian angka bulat biasa pada dunia nyata karena dilakukan casting double.