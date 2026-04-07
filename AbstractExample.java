abstract class Vehicle {
    
    // abstract method (no body)
    abstract void start();

    // normal method
    void fuelType() {
        System.out.println("Uses fuel");
    }
}

// subclass
class Car extends Vehicle {

    // implementing abstract method
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractExample {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();       // abstract method
        c.fuelType();    // normal method
    }
}