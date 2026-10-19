package inheritance_hybrid;

// Sesuai diagram di PDF: gabungan hierarchical (Car dan Fare sama-sama turunan Vehicle)
// dan multilevel (Bus turunan Fare, Fare turunan Vehicle)
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is Car");
    }
}

class Fare extends Vehicle {
    Fare() {
        System.out.println("This is a Fare (tarif) of Vehicle");
    }
}

class Bus extends Fare {
    Bus() {
        System.out.println("This Fare is for Bus");
    }
}

public class Test {
    public static void main(String[] args) {
        Car obj1 = new Car();
        System.out.println();
        Bus obj2 = new Bus();
    }
}
