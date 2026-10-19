package objekbeberapa;

class Animal {
}

// extends: Dog dan Cat mewarisi Animal (hubungan IS-A)
class Dog extends Animal {
}

class Cat extends Animal {
}

public class Test {
    public static void main(String[] args) {
        // Variabel milik parent class bisa menyimpan objek subclass
        Animal obj = new Dog(); // menggunakan Dog object
        System.out.println("obj sekarang: " + obj.getClass().getSimpleName());

        obj = new Cat();        // variabel yang sama dipakai ulang untuk Cat object
        System.out.println("obj sekarang: " + obj.getClass().getSimpleName());
    }
}
