/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author icisi
 */
class KurirReguler {
    // protected: bisa dipakai child class (KurirDrone), tapi tidak terbuka untuk package lain
    protected String nama;
 
    // constructor, public supaya bisa dipanggil dari main saat new
    public KurirReguler(String nama) {
        // this membedakan atribut kelas dengan parameter yang namanya sama
        this.nama = nama;
    }
 
    // method ini yang nanti di-override oleh child class
    // public karena dipanggil dari main
    public void kirimBarang(String alamat) {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}