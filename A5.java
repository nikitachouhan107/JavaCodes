package Abstraction;

abstract class Language {
    abstract void greet();
}

class English extends Language {
    void greet() {
        System.out.println("Hello");
    }
}

class Hindi extends Language {
    void greet() {
        System.out.println("Namaste");
    }
}

public class A5  {
    public static void main(String[] args) {
        Language l1 = new English();
        Language l2 = new Hindi();
        l1.greet();
        l2.greet();
    }
}

