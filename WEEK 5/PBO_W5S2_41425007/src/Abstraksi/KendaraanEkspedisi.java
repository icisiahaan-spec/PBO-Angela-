/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraksi;

/**
 *
 * @author icisi
 */
// abstract: kelas ini cuma kerangka (blueprint), tidak boleh dibuat objeknya pakai new
// kelas ini tidak extends dan tidak implements apa pun, dia parent paling atas
abstract class KendaraanEkspedisi {
    // protected: bisa dipakai langsung oleh child class (TrukBox, MobilVan, MotorKurir)
    protected String noPolisi;
    protected int kapasitasKg;
 
    // abstract class boleh punya constructor, nanti dipanggil child lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }
 
    // concrete method (ada isinya), langsung diwariskan ke semua child
    // public karena dipanggil dari main
    public void infoKendaraan() {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }
 
    // abstract method: tanpa isi dan diakhiri titik koma
    // setiap child yang konkret WAJIB mengisinya sendiri
    public abstract void angkutBarang(String namaBarang);
}