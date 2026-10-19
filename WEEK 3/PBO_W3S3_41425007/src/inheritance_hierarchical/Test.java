package inheritance_hierarchical;

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Car dan Bus sama-sama mewarisi satu parent, yaitu Vehicle
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class Test {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Bus obj2 = new Bus();
    }
}
