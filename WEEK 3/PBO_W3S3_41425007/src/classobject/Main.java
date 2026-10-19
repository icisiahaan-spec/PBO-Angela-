package classobject;

// Class = blueprint (cetakan) untuk membuat objek
class Student {
    // Atribut (state) yang dimiliki setiap objek Student
    int id;
    String n;

    // Constructor: dipanggil otomatis saat 'new', tugasnya mengisi atribut
    public Student(int id, String n) {
        this.id = id; // 'this' menunjuk ke objek yang sedang dibuat
        this.n = n;
    }
}

public class Main {
    public static void main(String[] args) {
        // 'new' membuat objek (instance) dari class Student dan memanggil constructor-nya
        Student s1 = new Student(10, "Alice");

        // System.out.println mencetak nilai ke console (dijelaskan sekali di file ini)
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
