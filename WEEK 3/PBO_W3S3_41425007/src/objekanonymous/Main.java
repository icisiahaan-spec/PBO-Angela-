package objekanonymous;

class Salam {
    void sapa(String nama) {
        System.out.println("Halo, " + nama);
    }
}

public class Main {
    public static void main(String[] args) {
        // Objek anonymous: dibuat dengan 'new' tanpa disimpan ke variabel,
        // langsung dipakai satu kali lalu dibuang
        new Salam().sapa("Alice");

        // Lambda: implementasi anonymous untuk interface Runnable.
        // Versi PDF memakai JavaFX Button, tetapi JavaFX butuh library tambahan
        // dan sering membuat error di NetBeans, jadi diganti Runnable dengan konsep yang sama.
        Runnable tombol = () -> System.out.println("Button clicked!");
        tombol.run();
    }
}
