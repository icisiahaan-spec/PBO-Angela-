package concurrency;

// Objek yang dipakai bersama oleh thread produsen dan konsumen
class AntreanShared {
    private String data;
    private boolean adaData = false;

    // synchronized: hanya satu thread yang boleh masuk pada satu waktu
    public synchronized void kirimPesan(String pesan) {
        // Selama data lama belum diambil, produsen menunggu
        while (adaData) {
            try {
                wait(); // thread menunggu sampai dibangunkan notify()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = pesan;
        this.adaData = true;
        System.out.println("Pesan dikirim: " + pesan);

        // Membangunkan thread konsumen bahwa data sudah siap
        notify();
    }

    public synchronized String ambilPesan() {
        // Selama belum ada data, konsumen menunggu
        while (!adaData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false;
        System.out.println("Pesan diterima: " + data);

        // Membangunkan thread produsen bahwa tempat sudah kosong
        notify();
        return data;
    }
}
