/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author icisi
 */
class MesinTarif {
    private String kotaAsal;

    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Versi 1: hitung ongkir cuma berdasarkan berat
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Versi 2: hitung ongkir + biaya asuransi (parameter beda jumlah dari versi 1)
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Versi 3: hitung ongkir + opsi express (parameter beda tipe dari versi 2)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000;
        }
        return total;
    }
}

/*
 * 1) Kenapa compiler bisa menentukan method hitungOngkir mana yang dijalankan
 *    sebelum program dieksekusi (compile-time)? Bagian apa yang diperiksa?
 *    Compiler memeriksa signature method, yaitu nama method + daftar parameternya
 *    (jumlah, tipe, dan urutan parameter). Contohnya tarif.hitungOngkir(2.0, true),
 *    argumennya (double, boolean), jadi compiler langsung mencocokkannya dengan method
 *    yang parameternya (double, boolean). Semua itu sudah kelihatan dari tulisan kodenya,
 *    jadi pilihan method sudah pasti saat kompilasi, tidak perlu menunggu program jalan.
 *
 * 2) Kenapa method public int hitungOngkir(double beratKg) ditolak compiler,
 *    padahal tipe kembaliannya beda (int vs double)?
 *    Karena signature-nya sama persis dengan method yang sudah ada, yaitu hitungOngkir(double).
 *    Tipe kembalian bukan bagian dari signature, jadi compiler menganggapnya method yang sama
 *    dan memberi error:
 *    "method hitungOngkir(double) is already defined in class MesinTarif".
 *    Lagi pula, pada pemanggilan tarif.hitungOngkir(2.0) compiler tidak bisa tahu
 *    method mana yang dimaksud, sebab tipe kembalian tidak kelihatan dari cara memanggilnya.
 */