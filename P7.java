package Polymorphism;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Car {
    void move() {
        System.out.println("Bike is riding");
    }
}

public class P7 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();
        c1.move();
        b1.move();
    }
}
