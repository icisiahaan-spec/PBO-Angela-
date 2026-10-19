package reflection;

// Class yang akan dibuat objeknya lewat Reflection
class Student {
    // Constructor tanpa parameter (default constructor) dibutuhkan oleh newInstance()
    public Student() {
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Reflection: mencari class berdasarkan nama saat program berjalan (runtime).
            // Nama harus lengkap dengan package, yaitu "reflection.Student", bukan "Student"
            Class<?> c = Class.forName("reflection.Student");

            // Ambil constructor tanpa parameter lalu buat objeknya
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();

            // Karena toString() tidak di-override, yang tercetak adalah namaClass@hashcode
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");
        } catch (Exception e) {
            // Menangkap error lain yang mungkin terjadi
            e.printStackTrace();
        }
    }
}
