package inisialisasiobjek_method;

public class Geeks {
    // Atribut static: milik class, bukan milik objek tertentu
    static String name;
    static float price;

    // Method setter: mengisi nilai atribut
    static void set(String n, float p) {
        name = n;
        price = p;
    }

    // Method getter: menampilkan nilai atribut
    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String[] args) {
        // Method static dipanggil lewat nama class, tanpa 'new'
        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    }
}
