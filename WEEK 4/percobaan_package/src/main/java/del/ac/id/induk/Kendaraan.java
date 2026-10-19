/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author icisi
 */
// "implements IKendaraan" -> class ini WAJIB mengisi logika untuk SEMUA method di interface
public class Kendaraan implements IKendaraan {
    // private: atribut ini cuma bisa diakses dari dalam class ini sendiri (encapsulation)
    private int jlhRoda, dimensiKendaraan, jlhSpion;
    private String warnaKendaraan;

    public Kendaraan() {}

    // @Override menandakan method ini mengisi ulang method yang sudah dideklarasikan di interface
    @Override
    public void setJlhRoda(int value) {
        jlhRoda = value;
    }
    @Override
    public void setDimensiKendaraan(int value) {
        dimensiKendaraan = value;
    }
    @Override
    public void setJlhSpion(int value) {
        jlhSpion = value;
    }
    @Override
    public void setWarnaKendaraan(String value) {
        warnaKendaraan = value;
    }

    @Override
    public void cetakInformasi(Object o) {
        if (o == null) System.out.println("Obejct is Null");
    }

    @Override
    public int getJlhRoda() {
        return jlhRoda;
    }
    @Override
    public int getDimensiKendaraan() {
        return dimensiKendaraan;
    }
    @Override
    public int getJlhSpion() {
        return jlhSpion;
    }
    @Override
    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return jlhTorsi * panjangGagang * rasioGigi;
    }
}