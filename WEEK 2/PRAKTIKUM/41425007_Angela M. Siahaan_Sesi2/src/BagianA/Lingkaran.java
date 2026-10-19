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
public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // "final" artinya nilai PI ini TIDAK BOLEH diubah lagi setelah didefinisikan
        // dipakai untuk nilai yang memang seharusnya tetap/konstan
        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        // Validasi: jari-jari tidak mungkin negatif secara fisik,
        // jadi kalau user input angka negatif, program kasih pesan error
        // dan TIDAK melanjutkan ke perhitungan (blok else di bawah tidak dijalankan)
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            // Rumus luas lingkaran: π × r²
            double luas = PI * r * r;
            // Rumus keliling lingkaran: 2 × π × r
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}

//Mengapa kita perlu validasi r < 0?
//karena tidak ada nilai jari jari lingkaran di dunia nyata yang bernilai negatif.Maka kalau nilai jari jarinya lebih kecil dari 0,
//maka akan ada output Error: jari-jari tidak boleh negatif.