package deserialization;

import java.io.Serializable;

// Serializable: penanda bahwa objek class ini boleh diubah menjadi byte (disimpan ke file)
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
