/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB_no2;

/**
 *
 * @author icisi
 */
// interface: daftar method yang wajib dibuat oleh kelas yang memakainya
// tanpa public karena semua ada di satu file, cukup dipakai di sini saja
interface Switchable {
    // hanya nama method, isinya ditulis di kelas yang implements
    void turnOn();
    void turnOff();
}

// interface kedua: kemampuan konek WiFi
interface Connectable {
    void connectToWifi(String ssid, String ipAddress);
}

// implements dua interface sekaligus, dipisah koma
// artinya wajib membuat semua method dari kedua interface
class SmartLamp implements Switchable, Connectable {
    // private: atribut dikunci, tidak bisa diubah langsung dari luar
    private int kecerahan;
    private boolean menyala; // status sakelar, awalnya false (mati)

    // public: konstruktor dipanggil dari main untuk membuat objek
    public SmartLamp(int kecerahan) {
        this.kecerahan = kecerahan;
        this.menyala = false;
    }

    // @Override: method ini adalah isi dari method di interface
    // harus public karena method di interface otomatis public
    @Override
    public void turnOn() {
        menyala = true;
        // System.out dipakai untuk mencetak teks ke layar
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + kecerahan + "%");
    }

    @Override
    public void turnOff() {
        menyala = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // cek status dulu: kalau masih mati, koneksi ditolak
        if (!menyala) {
            System.out.println("[Error] Lampu Pintar masih mati, nyalakan dulu sebelum konek WiFi!");
        } else {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        }
    }
}

// sama seperti SmartLamp, implements dua interface
class SmartAC implements Switchable, Connectable {
    private int suhu;        // private, sama alasannya
    private boolean menyala; // status sakelar

    public SmartAC(int suhu) {
        this.suhu = suhu;
        this.menyala = false;
    }

    @Override
    public void turnOn() {
        menyala = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + suhu + " C");
    }

    @Override
    public void turnOff() {
        menyala = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // aturan state: harus menyala dulu baru boleh konek
        if (!menyala) {
            System.out.println("[Error] AC Pintar masih mati, nyalakan dulu sebelum konek WiFi!");
        } else {
            System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
        }
    }
}

// satu-satunya yang public, namanya harus sama dengan nama file (SmartHome.java)
public class SmartHome {
    // titik awal program berjalan
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        lampu.turnOn();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff();

        // uji aturan state: lampu dimatikan dulu, jadi koneksi harus ditolak
        lampu.turnOff();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");
    }
}
