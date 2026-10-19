/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author icisi
 */
import java.util.*;
 
// Penyihir = parent class (kelas induk), tidak extends ke kelas lain
class Penyihir {
    // public supaya bisa dipanggil dari main
    public void ucapkanMantra() {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}
 
// extends: HarryPotter mewarisi Penyihir (child class)
class HarryPotter extends Penyihir {
    // @Override: menandai bahwa method ini menimpa method milik parent
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}
 
// child kedua dari Penyihir
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}
 
// Tambahan dari instruksi no. 2: RonWeasley juga mewarisi Penyihir
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan gugup, tapi tetap berusaha sekuat tenaga.");
    }
}
 
public class DemoPenyihir {
    public static void main(String[] args) {
        // variabelnya bertipe Penyihir (parent), objek aslinya child yang berbeda-beda
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();
 
        // method yang dipanggil sama, tapi yang jalan mengikuti objek aslinya saat program berjalan
        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
        penyihir3.ucapkanMantra(); // Output: versi RonWeasley
    }
}
 
/*
 * JAWABAN PERTANYAAN 1.2 (METHOD OVERRIDING)
 *
 * 1) Apa yang terjadi jika tidak memakai annotation @Override? Apakah kode masih berjalan?
 *    Kode masih berjalan dan outputnya sama. Selama nama method dan parameternya sama persis
 *    dengan milik parent, Java tetap menganggapnya sebagai overriding, karena @Override
 *    hanya penanda yang sifatnya opsional. Bedanya ada di pengecekan: dengan @Override,
 *    compiler langsung memberi error kalau method-nya tidak benar-benar menimpa method parent
 *    (misalnya salah ketik jadi ucapkanmantra). Tanpa @Override, method salah ketik itu
 *    dianggap method baru, lalu yang jalan malah versi parent dan tidak ada peringatan sama sekali.
 *
 * 2) Apa keuntungan polymorphism dalam contoh ini?
 *    Satu variabel bertipe Penyihir bisa dipakai untuk HarryPotter, Hermione, maupun RonWeasley,
 *    dan pemanggilannya tetap sama yaitu ucapkanMantra(). Java otomatis menjalankan versi milik
 *    objek aslinya. Jadi kode yang memakai Penyihir tidak perlu if-else untuk mengecek jenis
 *    penyihirnya, dan kalau ada penyihir baru (seperti RonWeasley yang ditambahkan di sini),
 *    kode lama tidak perlu diubah. Kodenya jadi lebih singkat dan mudah dikembangkan.
 */
 
