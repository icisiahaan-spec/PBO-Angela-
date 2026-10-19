package finalize_method;

public class Geeks {
    public static void main(String[] args) {
        Geeks t = new Geeks();
        System.out.println(t.hashCode());

        // Lepas referensi supaya objek memenuhi syarat dibersihkan Garbage Collector
        t = null;

        // Meminta JVM menjalankan Garbage Collector (hanya permintaan, tidak dijamin langsung)
        System.gc();

        System.out.println("end");
    }

    // Dipanggil Garbage Collector sebelum objek dihapus.
    // Catatan: finalize() berstatus deprecated di Java versi baru,
    // jadi mungkin muncul peringatan dan teks di bawah tidak selalu tercetak.
    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
