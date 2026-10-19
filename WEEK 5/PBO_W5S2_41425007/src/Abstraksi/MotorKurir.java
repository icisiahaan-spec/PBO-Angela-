/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraksi;

/**
 *
 * @author icisi
 */
// dibuat untuk Eksperimen 2, versi akhir ini sudah diperbaiki (lihat catatan di bawah)
class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }
 
    // method ini ditambahkan sebagai perbaikan error Eksperimen 2
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor [" + noPolisi + "] membawa '" + namaBarang
                + "' di boks belakang untuk pengantaran cepat.");
    }
}
 
/*
 * EKSPERIMEN 2 (class MotorKurir extends KendaraanEkspedisi, tanpa method angkutBarang)
 * Versi yang dicoba:
 *    class MotorKurir extends KendaraanEkspedisi {
 *        public MotorKurir(String noPolisi, int kapasitasKg) {
 *            super(noPolisi, kapasitasKg);
 *        }
 *    }
 * Pesan error:
 *    error: MotorKurir is not abstract and does not override abstract method
 *    angkutBarang(String) in KendaraanEkspedisi
 * Dua opsi perbaikan dari IDE:
 *    1. Implement all abstract methods (IDE membuatkan method angkutBarang di MotorKurir
 *       supaya tinggal diisi).
 *    2. Make class MotorKurir abstract (MotorKurir dijadikan abstract class juga,
 *       jadi tidak wajib mengisi method itu).
 * Yang dipakai di kode ini adalah opsi 1, jadi method angkutBarang sudah ditulis di MotorKurir.
 */
