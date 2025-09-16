package Abstraction;


abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class A1 {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
    }
}
