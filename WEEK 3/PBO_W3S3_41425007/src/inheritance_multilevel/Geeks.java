package inheritance_multilevel;

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// FourWheeler mewarisi Vehicle
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}

// Car mewarisi FourWheeler (pewarisan bertingkat)
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Geeks {
    public static void main(String[] args) {
        // Urutan cetak: Vehicle -> FourWheeler -> Car
        Car obj = new Car();
    }
}
