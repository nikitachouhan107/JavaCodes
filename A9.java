package Abstraction;

abstract class Toy {
    abstract void play(); // abstract method
}

class CarToy extends Toy {
    void play() {
        System.out.println("Playing with a Car Toy");
    }
}

class Doll extends Toy {
    void play() {
        System.out.println("Playing with a Doll");
    }
}

public class A9 {
    public static void main(String[] args) {
        Toy t1 = new CarToy();
        Toy t2 = new Doll();
        t1.play();
        t2.play();
    }
}
