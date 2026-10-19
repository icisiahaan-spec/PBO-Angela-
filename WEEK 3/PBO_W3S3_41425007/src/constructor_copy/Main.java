package constructor_copy;

class Geeks {
    String name;
    int id;

    // Parameterized constructor
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor: menerima objek lain lalu menyalin datanya ke objek baru
    Geeks(Geeks obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("First Object");
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);

        System.out.println();

        // geek2 dibuat dari geek1 memakai copy constructor
        Geeks geek2 = new Geeks(geek1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("GeekName: " + geek2.name + " and GeekId: " + geek2.id);
    }
}
