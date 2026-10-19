package tostring_method;

public class Student {

    // Tanpa override, toString() bawaan Object mencetak namaClass@hashcode
    @Override
    public String toString() {
        return "Student object";
    }

    public static void main(String[] args) {
        Student s = new Student();          // membuat objek Student
        System.out.println(s.toString());   // memanggil toString()
    }
}
