package passing_object;

class ObjectPassDemo {
    int a, b;

    ObjectPassDemo(int i, int j) {
        a = i;
        b = j;
    }

    // Method menerima objek lain sebagai parameter untuk dibandingkan isinya
    boolean equalTo(ObjectPassDemo o) {
        return (o.a == a && o.b == b);
    }
}

public class Main {
    public static void main(String[] args) {
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Objek ob2 dan ob3 dikirim sebagai argumen ke method equalTo
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2)); // true
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3)); // false
    }
}
