/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author icisi
 */
public interface IKendaraan {
    // Method-method ini cuma DIDEKLARASIKAN (nama + parameter),
    // TANPA isi/logika apapun -- ini yang membedakan interface dari class biasa
    void setJlhRoda(int value);
    void setDimensiKendaraan(int value);
    void setJlhSpion(int value);
    void setWarnaKendaraan(String value);
    void cetakInformasi(Object o);

    int getJlhRoda();
    int getDimensiKendaraan();
    int getJlhSpion();

    float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi);
    String getWarnaKendaraan();
}
