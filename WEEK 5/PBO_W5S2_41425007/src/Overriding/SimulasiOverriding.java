/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author icisi
 */
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
 
        // variabelnya sama-sama bertipe KurirReguler, tapi objek aslinya beda
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");
 
        // method yang dipanggil sama, tapi yang jalan mengikuti objek aslinya saat program berjalan (runtime)
        k1.kirimBarang("Jl. Sudirman No. 10"); // versi KurirReguler
        k2.kirimBarang("Gedung Graha Lt. 5");  // versi KurirDrone
    }
}
 