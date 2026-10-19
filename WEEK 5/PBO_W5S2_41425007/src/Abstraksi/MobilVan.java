/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraksi;

/**
 *
 * @author icisi
 */
// child kedua dari KendaraanEkspedisi, caranya sama dengan TrukBox
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }
 
    // isi abstract method versi MobilVan
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang
                + "' di bagasi belakang untuk distribusi kota.");
    }
}
