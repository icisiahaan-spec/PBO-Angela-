package getclass_method;

public class Geeks {
    public static void main(String[] args) {
        Object o = new String("GeeksForGeeks");

        // getClass() mengembalikan class asli objek saat runtime (bukan tipe variabelnya)
        Class<?> c = o.getClass();

        // getName() mengambil nama lengkap class tersebut
        System.out.println("Class of Object o is: " + c.getName());
    }
}
