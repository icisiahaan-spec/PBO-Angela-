/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author icisi
 */
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Deret Fibonacci:");
        // a dan b adalah dua angka pertama deret Fibonacci (0 dan 1)
        int a = 0, b = 1;

        // Perulangan sebanyak n kali untuk mencetak n angka Fibonacci
        for (int i = 0; i < n; i++) {
            // Cetak angka "a" dulu (angka Fibonacci saat ini), diberi spasi setelahnya
            System.out.print(a + " ");
            // Hitung angka Fibonacci berikutnya: hasil penjumlahan a dan b
            int next = a + b;
            // Geser posisi: a sekarang jadi nilai b (persiapan untuk perulangan berikutnya)
            a = b;
            // b sekarang jadi angka baru yang tadi dihitung
            b = next;
        }
        // println kosong ini cuma untuk pindah ke baris baru setelah deret selesai dicetak
        System.out.println();

        System.out.print("Masukkan bilangan untuk dicek prima: ");
        int num = scanner.nextInt();

        // Variabel penanda (flag): dianggap prima dulu (true), nanti diubah jadi false kalau terbukti tidak
        boolean isPrime = true;

        // Bilangan 0, 1, atau negatif otomatis bukan bilangan prima
        if (num <= 1) {
            isPrime = false;
        } else {
            // Cek apakah num habis dibagi oleh angka 2 sampai akar kuadrat dari num
            // (cukup sampai akar kuadrat, karena kalau lebih dari itu, sudah pasti bukan faktor pembagi baru)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // num % i == 0 artinya num habis dibagi i (tidak ada sisa) -> berarti num bukan prima
                if (num % i == 0) {
                    isPrime = false;
                    break; // langsung berhenti, tidak perlu cek angka selanjutnya
                }
            }
        }

        // Operator ternary (kondisi ? nilaiJikaTrue : nilaiJikaFalse)
        // ini cara singkat menulis if-else dalam satu baris
        System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
}

// Bagaimana cara mengoptimalkan algoritma Fibonacci untuk jumlah yang besar?
//Cara di kode ini (perulangan for, iteratif) sudah cukup efisien untuk n besar. Yang perlu dihindari adalah pendekatan rekursif tanpa optimasi, 
//karena setiap angka dihitung ulang berkali-kali sehingga sangat lambat untuk n besar. Kalau tetap ingin pakai rekursi, bisa dioptimalkan dengan teknik memoization 
//(menyimpan hasil yang sudah dihitung supaya tidak dihitung ulang).
