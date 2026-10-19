/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kombinasi;

/**
 *
 * @author icisi
 */
import java.util.*;
 
import java.util.ArrayList;
import java.util.List;
 
// abstract: Mantra cuma kerangka, tidak bisa dibuat objeknya langsung
// kelas ini tidak extends dan tidak implements apa pun, dia parent paling atas
abstract class Mantra {
    // private: nama dikunci, dibaca lewat getter
    private String nama;
 
    // constructor, dipanggil subclass lewat super()
    public Mantra(String nama) {
        this.nama = nama;
    }
 
    // getter: public supaya nama mantra bisa dibaca dari kelas lain (Penyihir)
    public String getNama() {
        return nama;
    }
 
    // abstract method untuk efek mantra: tanpa isi, wajib diisi oleh subclass
    public abstract void efek();
}
 
// extends: Expelliarmus adalah subclass konkret dari Mantra
class Expelliarmus extends Mantra {
    public Expelliarmus() {
        // super() memanggil constructor parent untuk mengisi nama
        super("Expelliarmus");
    }
 
    // @Override: ini isi dari abstract method efek() milik parent
    @Override
    public void efek() {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Melucuti senjata lawan!");
    }
}
 
class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }
 
    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}
 
class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }
 
    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}
 
// Penyihir tidak extends ke kelas lain, tapi menyimpan banyak objek Mantra (relasi "punya")
class Penyihir {
    private String nama;
    // List bertipe Mantra (parent), jadi bisa diisi mantra apa saja
    private List<Mantra> mantraList;
 
    public Penyihir(String nama) {
        this.nama = nama;
        // ArrayList = daftar yang ukurannya bisa bertambah
        this.mantraList = new ArrayList<>();
    }
 
    // menambah mantra ke daftar mantra yang sudah dipelajari
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }
 
    // mencari mantra berdasarkan nama, lalu menjalankan efeknya
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                // polymorphism: efek() yang jalan mengikuti objek aslinya
                mantra.efek();
                return; // sudah ketemu, keluar dari method
            }
        }
        // sampai sini berarti mantranya tidak ada di daftar
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
 
    // Tambahan dari instruksi no. 2: mengucapkan semua mantra dalam satu perintah
    public void ucapkanSemuaMantra() {
        // cek dulu kalau belum punya mantra sama sekali
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }
        System.out.println(nama + " mengucapkan semua mantranya:");
        // satu perulangan untuk semua mantra, tidak perlu cek jenis mantranya
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}
 
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
 
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);
 
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos
 
        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");
 
        // Tambahan: ucapkan semua mantra dalam satu perintah
        harry.ucapkanSemuaMantra();
    }
}
 
/*
 * JAWABAN PERTANYAAN 3.1 (POLYMORPHISM DAN ABSTRACT CLASS)
 *
 * 1) Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
 *    Abstract class Mantra menetapkan aturannya: setiap mantra punya nama dan wajib punya
 *    method efek(), tapi isi efek() diserahkan ke subclass (Expelliarmus, ExpectoPatronum, Lumos).
 *    Kelas Penyihir hanya mengenal tipe Mantra, jadi daftarnya (List<Mantra>) bisa diisi mantra
 *    apa saja. Waktu mantra.efek() dipanggil, Java menjalankan efek() milik objek aslinya saat
 *    program berjalan, itulah polymorphism. Abstract class menjamin semua objek di daftar pasti
 *    punya efek(), dan polymorphism membuat pemanggilannya sama untuk semua mantra.
 *
 * 2) Apa yang terjadi jika menambahkan mantra baru tanpa mengubah kelas Penyihir? Apakah mudah?
 *    Sangat mudah. Cukup membuat subclass baru dari Mantra, isi constructor dengan super("nama")
 *    dan implementasikan efek(), lalu dipakai lewat harry.belajarMantra(...). Kelas Penyihir tidak
 *    perlu diubah karena hanya bergantung pada tipe Mantra, bukan pada mantra tertentu, dan
 *    tidak ada if-else per jenis mantra. Contohnya Lumos di program ini: ditambahkan tanpa
 *    mengubah satu baris pun di Penyihir.
 */
