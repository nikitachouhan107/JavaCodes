package Abstraction;

abstract class Laptop {
    abstract void brand();
}

class Dell extends Laptop {
    void brand() {
        System.out.println("This is Dell Laptop");
    }
}

public class A3 {
    public static void main(String[] args) {
        Laptop l = new Dell();
        l.brand();
    }
}
