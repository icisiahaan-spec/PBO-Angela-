package inheritance_multiple;

// Java tidak mengizinkan extends dari dua class, tetapi boleh implements banyak interface
interface LandVehicle {
    // default method: method dengan isi di dalam interface
    default void landInfo() {
        System.out.println("This is a LandVehicle");
    }
}

interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}

// Satu class mengimplementasikan dua interface sekaligus
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}

public class Test {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.waterInfo();
        obj.landInfo();
    }
}
