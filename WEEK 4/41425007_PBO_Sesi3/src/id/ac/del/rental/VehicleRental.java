/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author icisi
 */

public class VehicleRental {
    // private: atribut dikunci, tidak bisa diubah langsung dari luar kelas
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    // public: konstruktor dipanggil dari TestRental yang beda package
    public VehicleRental(String plateNumber, double rate) {
        // lewat setter supaya validasinya sama dengan saat data diubah nanti
        setPlateNumber(plateNumber);
        setRentalRatePerDay(rate);
    }

    // setter public: satu-satunya jalan mengubah plat, dan ada validasi
    public void setPlateNumber(String plateNumber) {
        if (plateNumber != null && !plateNumber.isEmpty()) {
            this.plateNumber = plateNumber;
        } else {
            // System.out.println dipakai untuk mencetak pesan ke layar
            System.out.println("Nomor plat tidak boleh kosong.");
        }
    }

    // getter public: supaya plat bisa dibaca dari luar
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setRentalRatePerDay(double rate) {
        if (rate > 0) {
            this.rentalRatePerDay = rate;
        } else {
            System.out.println("Harga sewa harus lebih dari 0.");
        }
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalDays(int days) {
        // hari sewa harus positif, jadi -7 ditolak
        if (days > 0) {
            this.rentalDays = days;
        } else {
            System.out.println("Jumlah hari sewa harus lebih dari 0.");
        }
    }

    public int getRentalDays() {
        return rentalDays;
    }

    // parameter bertipe interface: boleh diisi objek diskon apa pun yang implements Discountable
    public double getTotalCost(Discountable discount) {
        double total = rentalRatePerDay * rentalDays;
        // kalau tidak ada diskon, kembalikan harga penuh
        if (discount == null) {
            return total;
        }
        // potongan dihitung oleh objek diskon, hasilnya tergantung jenis diskonnya
        return total - discount.calculateDiscount(total);
    }
}