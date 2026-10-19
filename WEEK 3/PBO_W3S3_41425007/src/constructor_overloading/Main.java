package constructor_overloading;

class Geeks {
    // Constructor overloading: nama sama, daftar parameter berbeda

    // Constructor dengan satu parameter String
    Geeks(String name) {
        System.out.println("Constructor with one argument - String: " + name);
    }

    // Constructor dengan dua parameter
    Geeks(String name, int age) {
        System.out.println("Constructor with two arguments: "
                + " String and Integer: " + name + " " + age);
    }

    // Constructor dengan satu parameter, tetapi tipenya long
    Geeks(long id) {
        System.out.println("Constructor with one argument: " + "Long: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        // Java memilih constructor berdasarkan jumlah dan tipe argumen
        Geeks geek2 = new Geeks("Sweta");
        Geeks geek3 = new Geeks("Amiya", 28);
        Geeks geek4 = new Geeks(325614567);
    }
}
