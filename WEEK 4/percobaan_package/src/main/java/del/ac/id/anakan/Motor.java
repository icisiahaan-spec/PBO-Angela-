/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.anakan;

/**
 *
 * @author icisi
 */
// import diperlukan karena Kendaraan berada di package berbeda (del.ac.id.induk)
import del.ac.id.induk.Kendaraan;

// "extends Kendaraan" -> Motor mewarisi semua atribut & method yang sudah ada di Kendaraan
public class Motor extends Kendaraan {
    // Atribut tambahan, khusus milik Motor (tidak ada di Kendaraan/interface)
    private int jlhTorsi, faktorPembagi;
    private float panjangGagang, rasioGigi;

    public Motor() {}

    public void setJlhTorsi(int value) {
        jlhTorsi = value;
    }
    public void setPanjangGagang(float value) {
        panjangGagang = value;
    }
    public void setRasioGigi(float value) {
        rasioGigi = value;
    }
    public void setFaktorPembagi(int value) {
        faktorPembagi = value;
    }

    // @Override di sini artinya: menimpa/mengganti method kalkulasiPercepatan yang sudah ada di Kendaraan
    // dengan versi baru yang juga dikalikan faktorPembagi
    @Override
    public float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        // super.kalkulasiPercepatan(...) artinya: panggil dulu versi ASLI dari class induk (Kendaraan)
        return super.kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi) * faktorPembagi;
    }

    @Override
    public void cetakInformasi(Object o) {
        System.out.println("==================================================");
        System.out.println(String.format("Motor saya berwarna %s.",
                ((Motor)o).getWarnaKendaraan()));
        System.out.println(String.format("Dimensi motor tersebut adalah %d meter persegi",
                ((Motor)o).getDimensiKendaraan()));
        System.out.println(String.format("dan dengan percepatan sekitar %.2f km/jam.",
                kalkulasiPercepatan(jlhTorsi, panjangGagang, rasioGigi)));
        System.out.println(String.format("Motor tersebut memiliki %d kaca spion dan %d roda. ",
                ((Motor)o).getJlhSpion(), ((Motor)o).getJlhRoda()));
        System.out.println("==================================================");
    }
}
