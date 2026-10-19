/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author icisi
 */
import java.util.Scanner;

public class GradeSystem {
    
    public static void main(String[] args) {
        //yang aawal tipe datanya,yg kedua yang di import(nama variable)
        Scanner scanner = new Scanner(System.in);
        // Array untuk menyimpan 5 nilai mahasiswa (ukurannya tetap, sudah ditentukan di awal)
        double[] grades = new double[5];
        // Variabel penampung jumlah total nilai, dipakai untuk menghitung rata-rata nanti
        double total = 0;

        // Input nilai
        // Perulangan untuk mengisi array grades satu per satu (index 0 sampai 4)
        for (int i = 0; i < 5; i++) {
            // (i+1) supaya tampilan ke user mulai dari "nilai ke-1", bukan "nilai ke-0"
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
           // Nilai yang diinput disimpan ke posisi ke-i dalam array
            grades[i] = scanner.nextDouble();
            // total += grades[i] artinya: total = total + grades[i]
            // dipakai untuk menjumlahkan semua nilai sambil loop berjalan
            total += grades[i];
        }

        // Hitung rata-rata
        double average = total / 5;
        System.out.println("Rata-rata nilai: " + average);

        // Kategorikan nilai
        // if-else if berantai: dicek dari atas, begitu ada syarat yang cocok, langsung berhenti
        char grade;
        if (average >= 85) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'E';

        System.out.println("Grade: " + grade);
        
        // Tampilkan nilai tertinggi dan terendah
        // Menyiapkan variabel max dan min, diawali dengan nilai pertama dalam array (index 0)
        double max = grades[0];
        double min = grades[0];

        // Perulangan mulai dari index 1 (bukan 0, karena index 0 sudah jadi nilai awal max/min)
        for (int i = 1; i < 5; i++) {
            // Kalau nilai saat ini lebih besar dari max yang tercatat, update max
            if (grades[i] > max) max = grades[i];
            if (grades[i] < min) min = grades[i];
        }

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
}

//1. Apa yang terjadi jika ada nilai yang diinput di luar rentang 0-100?
//Disini tidak ada pengecekan batas nilai, sehingga nilai berapa pun tetap akan diterima dan diproses 
//seolah-olah valid. Jadi jika angka dimasukkan negatif atau positif,maka program tetap akan menghitung rata-rata dan menentukan grade 
//berdasarkan angka tersebut, meskipun secara logika nilai ujian yang wajar seharusnya berada di rentang 0-100. Akibatnya, hasil rata-rata 
//dan kategori grade yang ditampilkan bisa menjadi tidak masuk akal atau menyesatkan, tanpa ada peringatan bagi pengguna bahwa input yang dimasukkan sebenarnya tidak valid.

//2.Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis?
//Program ini pakai array ukuran tetap (new double[5]), jadi cuma bisa nampung 5 data. Supaya jumlahnya dinamis, ada 2 cara: 
//yang pertama meminta user input jumlah data dulu, lalu buat array sesuai jumlah itu (new double[n]), atau (2) pakai ArrayList yang ukurannya otomatis menyesuaikan tanpa perlu ditentukan di awal.