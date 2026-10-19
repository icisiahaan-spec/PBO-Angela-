/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianB_no1;

/**
 *
 * @author icisi
 */
public class MainStudent {
    // public static void main: titik awal program berjalan
    public static void main(String[] args) {
        // buat objek mahasiswa lewat konstruktor
        StudentGrade mhs = new StudentGrade("11425001", "Marsha");

        mhs.setNilaiKuis(110.0); // di luar rentang, harus ditolak
        mhs.setNilaiKuis(85.0);  // valid
        mhs.setNilaiUTS(90.0);   // valid

        // Baris di bawah akan error kalau dibuka komentarnya,
        // karena tidak ada setter dan atributnya private:
        // mhs.nim = "999";
        // mhs.gradeHuruf = "A";

        mhs.cetakLaporan();
    }
}
