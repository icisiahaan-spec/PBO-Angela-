/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraksi;

/**
 *
 * @author icisi
 */// extends: TrukBox adalah child dari KendaraanEkspedisi (abstract class)
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        // super() memanggil constructor parent untuk mengisi noPolisi dan kapasitasKg
        super(noPolisi, kapasitasKg);
    }

    // @Override: ini isi dari abstract method milik parent
    @Override
    public void angkutBarang(String namaBarang) {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang
                + "' ke dalam kontainer tertutup pendingin.");
    }
}