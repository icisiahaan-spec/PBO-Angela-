/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author icisi
 */

/*
NIM: 41425007
Nama: Angela M. Siahaan
*/


// Import artinya "ambil/pinjam" fitur dari luar,
// karena Scanner bukan fitur dasar Java, harus diimport dulu supaya bisa dipakai
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {

        // Bikin objek Scanner, ini seperti "alat pembaca" yang akan menangkap
        // apapun yang diketik pengguna lewat keyboard (System.in = input dari keyboard)
        Scanner input = new Scanner(System.in);

        // System.out.print (tanpa "ln") artinya cetak teks TANPA pindah baris,
        // supaya nanti user bisa ngetik jawaban di baris yang sama
        System.out.print("Masukkan nama: ");
        // nextLine() membaca satu baris penuh teks yang diketik user (bisa mengandung spasi)
        // hasilnya disimpan ke variabel "nama" yang bertipe String (teks)
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        // nextInt() khusus membaca angka BULAT (tanpa koma) yang diketik user
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        // nextDouble() khusus membaca angka DESIMAL (boleh ada koma/titik)
        double tinggi = input.nextDouble();

        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        // nextBoolean() khusus membaca nilai true atau false
        boolean isMahasiswa = input.nextBoolean();

        // System.out.println (dengan "ln") mencetak teks LALU pindah baris baru
        // tanda "+" di sini bukan penjumlahan, tapi menyambung teks dengan isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        // Casting = "memaksa" mengubah satu tipe data ke tipe data lain
        // (int) di depan variabel artinya: ubah tinggi (double) jadi int
        // efeknya casting : bagian desimal/koma di belakang akan dibuang, bukan dibulatkan
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}

