/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author icisi
 */
import java.util.*;
 
public class Mantra {
    // Overload 1: satu parameter, hanya nama mantra
    // public supaya method ini bisa dipanggil dari kelas lain
    public void ucapkan(String namaMantra) {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }
 
    // Overload 2: dua parameter (String, int), nama method sama tapi parameternya beda
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        // kekuatan di atas 10 membuat lawan terlempar, selain itu senjata terlepas
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }
 
    // Overload 3: tiga parameter, ditambah target mantra
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }
 
    // Overload 4 (tambahan dari instruksi no. 2): nama mantra dan target, tanpa kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        // tanpa kekuatan, jadi efeknya standar: senjata target terlepas
        System.out.println("Efek: Senjata " + target + " terlepas.");
    }
 
    // Percobaan dari pertanyaan no. 2: urutan parameter dibalik (int dulu, baru String)
    public void ucapkan(int kekuatan, String namaMantra) {
        // isinya cukup memanggil versi (String, int) supaya kode tidak ditulis dua kali
        ucapkan(namaMantra, kekuatan);
    }
 
    // main: titik awal program berjalan
    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");                  // versi 1 parameter
        mantra.ucapkan("Expelliarmus", 5);               // versi (String, int)
        mantra.ucapkan("Expelliarmus", 15, "Voldemort"); // versi 3 parameter
        mantra.ucapkan("Expelliarmus", "Voldemort");     // versi baru (String, String)
        mantra.ucapkan(20, "Expelliarmus");              // versi baru (int, String)
    }
}
 
/*
 * JAWABAN PERTANYAAN 1.1 (METHOD OVERLOADING)
 *
 * 1) Apa yang terjadi jika salah satu method overloading dihapus, misalnya method dua parameter
 *    ucapkan(String namaMantra, int kekuatan)?
 *    Program tidak bisa dikompilasi. Compiler memberi error:
 *    error: no suitable method found for ucapkan(String,int)
 *    Penyebabnya, pemanggilan mantra.ucapkan("Expelliarmus", 5) di main mencari method dengan
 *    parameter (String, int), padahal method itu sudah tidak ada (method ucapkan(int, String)
 *    juga ikut error karena di dalamnya memanggil versi (String, int)). Method lain tidak bisa
 *    menggantikan: yang (String, String) butuh String di parameter kedua, yang tiga parameter
 *    butuh tiga argumen, dan yang (int, String) urutan tipenya terbalik. Jadi setiap versi
 *    overloading hanya bisa dipanggil dengan kombinasi tipe dan jumlah argumen yang persis
 *    sesuai. Hal yang sama terjadi kalau yang dihapus ucapkan(String, String): pemanggilan
 *    dengan target berupa String jadi error.
 *
 * 2) Bisakah overloading dengan urutan parameter berbeda? Coba ucapkan(int kekuatan, String namaMantra).
 *    Bisa. Method itu sudah dibuat di atas dan program tetap jalan. Alasannya, signature method
 *    terdiri dari nama dan urutan tipe parameter, jadi (String, int) dan (int, String) dianggap
 *    dua method yang berbeda. Saat dipanggil mantra.ucapkan(20, "Expelliarmus"), compiler
 *    memilih versi (int, String) dari urutan tipe argumennya. Walaupun boleh, cara ini bisa
 *    membingungkan orang yang membaca kode, jadi sebaiknya dipakai seperlunya.
 */
 