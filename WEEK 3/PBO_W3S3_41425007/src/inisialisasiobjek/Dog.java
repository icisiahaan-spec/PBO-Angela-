package inisialisasiobjek;

public class Dog {
    // Atribut objek
    String name;
    String breed;
    int age;
    String color;

    // Constructor: mengisi atribut saat objek dibuat dengan 'new'
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Getter: method untuk mengambil nilai atribut
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Override toString() milik class Object supaya objek tercetak sebagai teks yang bermakna
    @Override
    public String toString() {
        return "Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor();
    }

    public static void main(String[] args) {
        // 'new' mengalokasikan memori, memanggil constructor, dan mengembalikan referensi objek
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");

        // System.out.println mencetak hasil toString() ke console
        System.out.println(tuffy.toString());
    }
}
