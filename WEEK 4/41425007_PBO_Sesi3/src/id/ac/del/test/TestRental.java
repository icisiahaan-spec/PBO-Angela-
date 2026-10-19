/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author icisi
 */

// import: kelas dari package lain harus di-import dulu
// hanya kelas public yang bisa di-import
import id.ac.del.rental.CorporateDiscount;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.VehicleRental;

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        v.setRentalDays(-7); // ditolak, pesan error muncul
        v.setRentalDays(7);  // valid

        // referensi bertipe interface, isinya objek berbeda-beda (polimorfisme)
        Discountable member = new MemberDiscount();
        Discountable flash = new FlashSaleDiscount();
        Discountable corporate = new CorporateDiscount();

        System.out.println("Nomor Plat      : " + v.getPlateNumber());
        System.out.println("Harga per Hari  : Rp" + v.getRentalRatePerDay());
        System.out.println("Jumlah Hari     : " + v.getRentalDays());
        // method yang dipanggil sama, hasilnya beda sesuai objek diskonnya
        System.out.println("Total (Member)    : Rp" + v.getTotalCost(member));
        System.out.println("Total (Flash Sale): Rp" + v.getTotalCost(flash));
        System.out.println("Total (Corporate) : Rp" + v.getTotalCost(corporate));
    }
}

/*

/*
 * KODE ASLI DI MODUL 
 *
 * VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
 * v.plateNumber = "";            // Baris A
 * v.rentalRatePerDay = -500000;  // Baris B
 * v.discountRate = 0.20;         // Baris C
 * v.setRentalDays(-7);           // Baris D
 *
 * Atribut di VehicleRental asli:
 * public String plateNumber;
 * protected double rentalRatePerDay;
 * private int rentalDays;
 * double discountRate;           // tanpa modifier (default)





 * JAWABAN BAGIAN C 
 *
 * 1) Analisis kompilasi dan hak akses
 * Baris B dan Baris C yang error saat dikompilasi.
 * - Baris A (plateNumber, public): bisa diakses dari mana saja, termasuk package lain.
 * - Baris B (rentalRatePerDay, protected): hanya bisa diakses di kelas yang sama,
 *   package yang sama, atau subclass. TestRental beda package dan bukan subclass, jadi error.
 * - Baris C (discountRate, tanpa modifier/default): hanya bisa diakses dari package yang sama,
 *   jadi error karena TestRental ada di package lain.
 * - Baris D (setRentalDays, public): bisa diakses, jadi aman.
 * - private: hanya bisa diakses dari dalam kelasnya sendiri (contoh: rentalDays).
 *
 * 2) Kelemahan integritas data
 * i) Baris A mengubah plat langsung tanpa pengecekan, sehingga plat kosong ("") bisa masuk.
 *    Baris D memang lewat setter, tapi setRentalDays hanya meng-assign nilai tanpa validasi,
 *    jadi hari sewa negatif (-7) tetap diterima.
 * ii) Total biaya bisa negatif karena hari sewa negatif dikali tarif positif. Tarif dan diskon
 *    juga bisa diisi sembarangan (misalnya diskon di atas 1) karena tidak ada validasi.
 *    Refaktor: semua atribut dibuat private, validasi dipasang di konstruktor dan setter
 *    (hari > 0, tarif > 0, plat tidak kosong), dan akses data lewat getter/setter.
 *
 * 3) Penerapan interface
 * i) Interface Discountable berisi calculateDiscount(double amount), ada di Discountable.java.
 * ii) getTotalCost() diubah menjadi getTotalCost(Discountable discount). Objek diskon
 *    (MemberDiscount, FlashSaleDiscount, CorporateDiscount) dikirim dari TestRental saat runtime.
 *    Pemanggilan discount.calculateDiscount(total) sama, tapi hasilnya mengikuti objek yang
 *    dikirim. Itulah polimorfisme, dan VehicleRental tidak perlu diubah saat ada diskon baru.
 */