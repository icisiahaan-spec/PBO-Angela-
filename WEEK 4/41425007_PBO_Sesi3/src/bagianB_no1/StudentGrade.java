/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB_no1;

/**
 *
 * @author icisi
 */
public class StudentGrade {
    // private: atribut dikunci, tidak bisa diakses langsung dari luar kelas
    // final: NIM dan nama tidak bisa diubah lagi setelah diisi (read-only)
    private final String nim;
    private final String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    // gradeHuruf cuma punya getter, isinya dihitung otomatis oleh kelas ini
    private String gradeHuruf;

    // public: konstruktor harus bisa dipanggil dari kelas main untuk membuat objek
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;
        hitungGrade(); // nilai awal 0, jadi grade awalnya dihitung dulu
        // System.out dipakai untuk mencetak teks ke layar
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // Getter NIM dan Nama: public supaya bisa dibaca dari luar.
    // Tidak ada setter-nya, jadi datanya read-only
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    // Getter untuk nilai kuis dan UTS
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Getter gradeHuruf, juga tanpa setter karena tidak boleh diubah manual
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Setter kuis: public supaya bisa dipanggil dari luar, tapi ada validasi dulu
    public void setNilaiKuis(double nilaiKuis) {
        // nilai harus di antara 0 sampai 100
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilaiKuis);
            hitungGrade(); // setter berhasil, jadi grade dihitung ulang
        } else {
            // kalau di luar rentang, perubahan ditolak
            System.out.println("[Error] Nilai kuis tidak valid: " + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    // Setter UTS, logikanya sama dengan setter kuis
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilaiUTS);
            hitungGrade();
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilaiUTS + " (Harus antara 0 - 100)");
        }
    }

    // Hitung nilai akhir: 40% kuis + 60% UTS
    // public karena dipakai juga di kelas main
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUTS);
    }

    // private: hanya dipakai di dalam kelas ini, tidak boleh dipanggil dari luar.
    // Ini yang membuat gradeHuruf tidak bisa di-set langsung dari main
    private void hitungGrade() {
        double akhir = hitungNilaiAkhir();
        if (akhir >= 85) {
            gradeHuruf = "A";
        } else if (akhir >= 70) {
            gradeHuruf = "B";
        } else if (akhir >= 55) {
            gradeHuruf = "C";
        } else if (akhir >= 40) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Cetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade      : " + gradeHuruf);
    }
}
