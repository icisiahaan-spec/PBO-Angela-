package equals_method;

public class Student {
    int roll;

    // Override equals(): dua Student dianggap sama jika roll-nya sama
    @Override
    public boolean equals(Object o) {
        // instanceof memeriksa apakah o adalah objek Student
        if (o instanceof Student) {
            return this.roll == ((Student) o).roll;
        }
        return false;
    }

    // Aturan baku Java: jika equals() di-override, hashCode() sebaiknya ikut di-override
    @Override
    public int hashCode() {
        return roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 101;

        Student s2 = new Student();
        s2.roll = 101;

        Student s3 = new Student();
        s3.roll = 102;

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // false
    }
}
