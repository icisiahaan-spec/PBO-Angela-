package hashcode_method;

public class Student {
    int roll;

    // Override hashCode() supaya nilai hash ditentukan oleh roll
    @Override
    public int hashCode() {
        return roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 101;

        Student s2 = new Student();
        s2.roll = 102;

        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
