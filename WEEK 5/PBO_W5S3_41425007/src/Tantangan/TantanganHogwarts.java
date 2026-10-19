/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author icisi
 */
import java.util.ArrayList;
import java.util.List;
 
// Penyihir sederhana, dipakai sebagai Secret Keeper untuk mantra Fidelius
class Penyihir {
    // private: nama dikunci, dibaca lewat getter
    private String nama;
 
    public Penyihir(String nama) {
        this.nama = nama;
    }
 
    // getter: public supaya nama bisa dibaca dari kelas lain
    public String getNama() {
        return nama;
    }
}
 
// abstract: MantraPerlindungan cuma kerangka, tidak bisa dibuat objeknya langsung
// kelas ini tidak extends dan tidak implements apa pun, dia parent paling atas
abstract class MantraPerlindungan {
    private String nama;
 
    public MantraPerlindungan(String nama) {
        this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }
 
    // dua abstract method: tanpa isi, wajib diisi oleh setiap mantra perlindungan konkret
    public abstract void aktifkan();
 
    public abstract void nonaktifkan();
}
 
// extends: Protego adalah subclass konkret dari MantraPerlindungan
class Protego extends MantraPerlindungan {
    public Protego() {
        // super() memanggil constructor parent untuk mengisi nama
        super("Protego");
    }
 
    // @Override: ini isi dari abstract method milik parent
    @Override
    public void aktifkan() {
        // System.out.println dipakai untuk mencetak teks ke layar
        System.out.println("Perisai Protego terbentuk!");
    }
 
    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}
 
// Fidelius butuh seorang penyihir sebagai Secret Keeper
class Fidelius extends MantraPerlindungan {
    private Penyihir secretKeeper;
    private String rahasia;
 
    // Secret Keeper dan rahasianya wajib dikirim saat objek dibuat
    public Fidelius(Penyihir secretKeeper, String rahasia) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
        this.rahasia = rahasia;
    }
 
    @Override
    public void aktifkan() {
        // tanpa Secret Keeper, mantra ini tidak bisa diaktifkan
        if (secretKeeper == null) {
            System.out.println("Fidelius gagal: butuh penyihir sebagai Secret Keeper!");
        } else {
            System.out.println("Fidelius aktif! " + secretKeeper.getNama()
                    + " menjadi Secret Keeper untuk menjaga rahasia: " + rahasia);
        }
    }
 
    @Override
    public void nonaktifkan() {
        System.out.println("Fidelius dinonaktifkan. Rahasia '" + rahasia + "' tidak lagi dilindungi.");
    }
}
 
// mencegah apparition (berpindah tempat secara instan) di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    private String area;
 
    public MantraAntiApparition(String area) {
        super("Anti-Apparition");
        this.area = area;
    }
 
    @Override
    public void aktifkan() {
        System.out.println("Anti-Apparition aktif: tidak ada yang bisa ber-apparate di area " + area);
    }
 
    @Override
    public void nonaktifkan() {
        System.out.println("Anti-Apparition di area " + area + " dimatikan.");
    }
}
 
// SistemPertahanan menampung banyak mantra perlindungan
class SistemPertahanan {
    private String namaTempat;
    // List bertipe parent, jadi bisa diisi mantra perlindungan apa saja
    private List<MantraPerlindungan> daftarMantra;
 
    public SistemPertahanan(String namaTempat) {
        this.namaTempat = namaTempat;
        // ArrayList = daftar yang ukurannya bisa bertambah
        this.daftarMantra = new ArrayList<>();
    }
 
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println(mantra.getNama() + " ditambahkan ke sistem pertahanan " + namaTempat);
    }
 
    public void aktifkanSemuaMantra() {
        System.out.println("=== Mengaktifkan semua mantra " + namaTempat + " ===");
        // polymorphism: satu perulangan, aktifkan() yang jalan mengikuti objek aslinya
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }
 
    public void nonaktifkanSemuaMantra() {
        System.out.println("=== Menonaktifkan semua mantra " + namaTempat + " ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}
 
public class TantanganHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan("Hogwarts");
 
        // beberapa objek mantra, semuanya dimasukkan lewat tipe parent MantraPerlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius(new Penyihir("Albus Dumbledore"), "ai nga loja");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Hogwarts");
 
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);
 
        hogwarts.aktifkanSemuaMantra();
        hogwarts.nonaktifkanSemuaMantra();
    }
}
 
