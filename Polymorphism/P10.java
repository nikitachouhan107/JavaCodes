package Polymorphism;

class Employee {
    void work() {
        System.out.println("Employee working");
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer writing code");
    }
}

class Tester extends Employee {
    void work() {
        System.out.println("Tester testing software");
    }
}

public class P10 {
    public static void main(String[] args) {
        Employee e1 = new Developer();
        Employee e2 = new Tester();
        e1.work();
        e2.work();
    }
}
