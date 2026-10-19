package concurrency;

public class MainConcurrency {
    public static void main(String[] args) {
        AntreanShared antrean = new AntreanShared();

        // Thread produsen: mengirim 3 pesan (dibuat dengan lambda)
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Thread konsumen: mengambil 3 pesan
        Thread konsumen = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        // start() menjalankan thread secara bersamaan
        produsen.start();
        konsumen.start();
    }
}
