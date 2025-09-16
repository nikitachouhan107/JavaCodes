package Abstraction;

abstract class Bird {
    abstract void fly();
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies fast");
    }
}

public class A6 {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
    }
}
