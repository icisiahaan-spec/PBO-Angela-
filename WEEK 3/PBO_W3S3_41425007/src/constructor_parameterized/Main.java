package constructor_parameterized;

class Geeks {
    String name;
    int id;

    // Parameterized constructor: nilai atribut ditentukan lewat parameter
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Main {
    public static void main(String[] args) {
        // Memanggil parameterized constructor
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name + " and GeekId: " + geek1.id);
    }
}
