/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author icisi
 */
import java.util.*;
 
// abstract: kelas ini cuma kerangka, tidak boleh dibuat objeknya langsung pakai new
// kelas ini tidak extends dan tidak implements apa pun, dia parent paling atas
abstract class MantraAbstrak {
    // private: nama dikunci, subclass tidak bisa mengaksesnya langsung (isi lewat constructor)
    private String nama;
 
    // constructor, dipanggil subclass lewat super()
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }
 
    // abstract method: tanpa isi, wajib diimplementasikan oleh subclass konkret
    public abstract void efek();
 
    // method konkret (ada isinya), langsung diwariskan ke semua subclass
    public void ucapkan() {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Mengucapkan mantra: " + nama);
    }
}
 
// extends: Expelliarmus adalah subclass konkret dari MantraAbstrak
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        // super() memanggil constructor parent untuk mengisi nama
        super("Expelliarmus");
    }
 
    // @Override: ini isi dari abstract method efek() milik parent
    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}
 
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }
 
    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}
 
// Tambahan dari instruksi no. 2: mantra baru Lumos
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }
 
    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat.");
    }
}
 
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // variabel bertipe parent (abstract), objeknya dari subclass konkret
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();
 
        // PERCOBAAN pertanyaan 1: membuat objek abstract class langsung (dibiarkan jadi komentar
        // supaya program tetap bisa dijalankan)
        //MantraAbstrak mantra4 = new MantraAbstrak("Percobaan");
 
        mantra1.ucapkan();
        mantra1.efek();
 
        mantra2.ucapkan();
        mantra2.efek();
 
        mantra3.ucapkan();
        mantra3.efek();
    }
}
 
/*
 * JAWABAN PERTANYAAN 2.1 (ABSTRACT CLASS)
 *
 * 1) Apa yang terjadi jika mencoba membuat objek dari MantraAbstrak langsung?
 *    Contoh: MantraAbstrak mantra4 = new MantraAbstrak("Percobaan");
 *    Program tidak bisa dikompilasi. Pesan errornya:
 *    error: MantraAbstrak is abstract; cannot be instantiated
 *    Artinya MantraAbstrak adalah abstract class, jadi hanya kerangka yang belum lengkap
 *    (method efek() belum punya isi). Kalau objeknya boleh dibuat, memanggil efek() tidak
 *    akan menghasilkan apa-apa. Karena itu Java melarang new pada abstract class, dan objek
 *    hanya boleh dibuat dari subclass konkret seperti Expelliarmus, ExpectoPatronum, atau Lumos.
 *
 * 2) Mengapa perlu membuat abstract class? Apa keuntungannya?
 *    - Memaksa semua mantra konkret punya efek(). Kalau ada subclass yang lupa mengisinya,
 *      compiler langsung memberi error.
 *    - Kode yang sama (atribut nama dan method ucapkan()) cukup ditulis sekali di parent
 *      dan diwariskan, jadi tidak diulang di setiap mantra.
 *    - Mencegah objek yang tidak masuk akal, misalnya "mantra" yang tidak jelas efeknya.
 *    - Semua mantra bisa dipakai lewat satu tipe (MantraAbstrak), jadi menambah mantra baru
 *      seperti Lumos cukup membuat subclass baru tanpa mengubah kode yang sudah ada.
 */
 