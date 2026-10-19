/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraksi;

/**
 *
 * @author icisi
 */
public class SimulasiAbstraksi {
    // main: titik awal program berjalan
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");
 
        // PERCOBAAN 1: menguji larangan instansiasi langsung abstract class
        // (dibiarkan jadi komentar supaya program tetap bisa dijalankan)
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
 
        // PERCOBAAN 2: instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();                  // method warisan dari parent
        fuso.angkutBarang("20 Unit Kulkas");   // method versi TrukBox
 
        System.out.println("---------------------------------");
 
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
 
        System.out.println("=== TANTANGAN EKSTRA POLIMORFISME ===");
 
        // array bertipe parent, tapi isinya objek dari tiga child yang berbeda
        KendaraanEkspedisi[] armada = {
            new TrukBox("B 9081 TXT", 5000),
            new MobilVan("B 1122 KAA", 800),
            new MotorKurir("BK 5566 DEL", 50)
        };
 
        // satu for-loop untuk semua objek, tidak perlu cek jenis child secara manual
        for (KendaraanEkspedisi kendaraan : armada) {
            // dipanggil lewat referensi parent, yang jalan method milik objek aslinya (runtime)
            kendaraan.angkutBarang("Paket Elektronik");
        }
    }
}
 
/*
 * EKSPERIMEN 1 (baris PERCOBAAN 1 di-uncomment)
 * Pesan error:
 *    error: KendaraanEkspedisi is abstract; cannot be instantiated
 * Kenapa Java menggagalkan baris ini:
 *    KendaraanEkspedisi adalah abstract class, jadi hanya konsep atau kerangka, bentuk
 *    nyatanya belum jelas (bukan truk, bukan van, bukan motor). Di dalamnya juga ada
 *    method angkutBarang() yang belum punya isi, sehingga objeknya tidak akan bisa
 *    bekerja kalau dibuat. Sama seperti pada Insight Konsep: "Kendaraan Ekspedisi" belum
 *    bisa "dibeli" sebelum disebut jenisnya. Objek hanya boleh dibuat dari kelas konkret
 *    seperti TrukBox atau MobilVan.
 *
 * (Jawaban Eksperimen 2 ada di bagian bawah file MotorKurir.java)
 *
 * PENJELASAN TANTANGAN EKSTRA
 * Variabel kendaraan bertipe KendaraanEkspedisi (parent), tapi objek aslinya bisa TrukBox,
 * MobilVan, atau MotorKurir. Saat kendaraan.angkutBarang(...) dipanggil, Java memilih
 * method milik objek aslinya saat program berjalan. Karena itu satu baris di dalam loop
 * sudah cukup, dan kalau nanti ada child baru, loop-nya tidak perlu diubah.
 */