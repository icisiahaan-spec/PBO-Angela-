package constructor_default;

public class Geeks {

    // Explicit default constructor: constructor tanpa parameter yang kita tulis sendiri
    Geeks() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        // Constructor otomatis dipanggil saat 'new'
        Geeks hello = new Geeks();
    }
}
