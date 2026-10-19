/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author icisi
 */
  import java.util.Scanner;

public class Shopping  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menampung maksimal 20 item belanja
        String[] items = new String[20];
        // Penanda berapa banyak item yang sudah terisi (slot yang benar-benar dipakai)
        int jumlahItem = 0;

        boolean keluar = false; // penanda kapan program berhenti

        // Perulangan terus-menerus sampai user pilih "Keluar"
        while (!keluar) {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan sisa "enter" setelah nextInt(), supaya nextLine() berikutnya tidak terlewat

            if (pilihan == 1) {
                // Tambah item
                System.out.print("Masukkan item: ");
                String item = scanner.nextLine();
                items[jumlahItem] = item; // simpan item di slot kosong berikutnya
                jumlahItem++; // slot terisi bertambah 1
                System.out.println(item + " berhasil ditambahkan!");

            } else if (pilihan == 2) {
                // Hapus item
                System.out.print("Hapus item pada posisi: ");
                int posisi = scanner.nextInt();
                int index = posisi - 1; // posisi user mulai dari 1, index array mulai dari 0

                String namaTerhapus = items[index];
                // Menggeser semua item setelah posisi yang dihapus, maju satu langkah
                for (int i = index; i < jumlahItem - 1; i++) {
                    items[i] = items[i + 1];
                }
                jumlahItem--; // slot terisi berkurang 1
                System.out.println(namaTerhapus + " berhasil dihapus!");

            } else if (pilihan == 3) {
                // Tampilkan semua item
                System.out.println("Daftar belanja:");
                for (int i = 0; i < jumlahItem; i++) {
                    System.out.println((i + 1) + ". " + items[i]);
                }

            } else if (pilihan == 4) {
                // Cari item
                System.out.print("Cari item: ");
                String cari = scanner.nextLine();
                boolean ditemukan = false;
                for (int i = 0; i < jumlahItem; i++) {
                    if (items[i].equalsIgnoreCase(cari)) {
                        System.out.println(cari + " ditemukan pada posisi " + (i + 1));
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println(cari + " tidak ditemukan.");
                }

            } else if (pilihan == 5) {
                // Keluar
                System.out.println("Terima kasih!");
                keluar = true;
            }
        }
    }
}

Catatan penting: scanner.nextLine() setelah scanner.nextInt() itu wajib — karena nextInt() cuma membaca angkanya saja, sisa tombol Enter yang ditekan user masih "nyangkut" di buffer. Kalau tidak dibersihkan, nextLine() berikutnya akan langsung membaca string kosong, bukan menunggu input baru.

Soal 3 – TimeConverter.java (Konverter Waktu)
java
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Detik ke format HH:MM:SS
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = scanner.nextInt();

            int jam = totalDetik / 3600; // 1 jam = 3600 detik
            int sisaSetelahJam = totalDetik % 3600;
            int menit = sisaSetelahJam / 60; // 1 menit = 60 detik
            int detik = sisaSetelahJam % 60;

            // %02d artinya: tampilkan angka minimal 2 digit, diisi angka 0 di depan jika kurang
            System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);

        } else if (pilihan == 2) {
            // HH:MM:SS ke total detik
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = scanner.next();

            // split(":") memecah teks jadi beberapa bagian berdasarkan tanda ":"
            String[] bagian = waktu.split(":");
            int jam = Integer.parseInt(bagian[0]); // ubah teks jadi angka
            int menit = Integer.parseInt(bagian[1]);
            int detik = Integer.parseInt(bagian[2]);

            int totalDetik = (jam * 3600) + (menit * 60) + detik;
            System.out.println("Hasil: " + totalDetik + " detik");
        }
    }
}

