package Abstraction;

abstract class Vehicle {
    abstract void run();

    void fuel() {
        System.out.println("All vehicles need fuel");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}

public class A2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.run();
        v.fuel();
    }
}
