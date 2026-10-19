package inheritance_single;

class Vehicle { // Super class
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass: Car mewarisi Vehicle
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

public class Test {
    public static void main(String[] args) {
        // Constructor parent (Vehicle) dijalankan dulu, baru constructor Car
        Car obj = new Car();
    }
}
