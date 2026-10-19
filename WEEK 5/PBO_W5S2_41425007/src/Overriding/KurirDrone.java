/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author icisi
 */
// extends = KurirDrone mewarisi KurirReguler (child class), tidak implements interface apa pun
class KurirDrone extends KurirReguler {
    // private: id drone hanya dipakai di dalam kelas ini
    private String idDrone;

    public KurirDrone(String nama, String idDrone) {
        // super(nama) memanggil constructor parent supaya atribut nama terisi
        super(nama);
        this.idDrone = idDrone;
    }

    // @Override: memberi tahu compiler bahwa method ini menimpa method di parent
    // nama dan parameternya harus sama persis dengan yang ada di KurirReguler
    @Override
    public void kirimBarang(String alamat) {
        // nama boleh dipakai langsung karena protected di parent
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama
                + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

/*
 * LEMBAR ANALISIS OVERRIDING
 *
 * Percobaan: baris @Override di KurirDrone dijadikan komentar, lalu nama method diubah jadi
 * public void kirimbarang(String alamat) (b kecil).
 *
 * 1) Output dari k2.kirimBarang("Gedung Graha Lt. 5") di SimulasiOverriding:
 *    Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan.
 *    Jadi berubah menjadi jalur darat. Alasannya, kirimbarang (b kecil) dianggap Java sebagai
 *    method baru yang namanya beda, bukan method yang menimpa kirimBarang milik parent.
 *    Akibatnya k2.kirimBarang(...) memakai method bawaan KurirReguler, dan method milik drone
 *    tidak pernah dipanggil. Program tetap bisa dikompilasi, tidak ada error atau peringatan.
 *
 * 2) Pesan error setelah @Override dikembalikan di atas method yang salah ketik:
 *    error: method does not override or implement a method from a supertype
 *
 * 3) Fungsi utama @Override bagi programmer:
 *    @Override dipakai untuk menandai bahwa sebuah method memang dimaksudkan untuk menimpa
 *    method milik parent class. Kalau ternyata namanya atau parameternya tidak sama dengan
 *    yang ada di parent (misalnya salah ketik), compiler langsung memberi error. Jadi
 *    kesalahannya ketahuan saat kompilasi, bukan baru ketahuan ketika program jalan dan
 *    hasilnya diam-diam salah seperti pada percobaan di atas.
 */
