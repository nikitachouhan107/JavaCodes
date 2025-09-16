package Abstraction;

abstract class Employee {
    String name = "Employee";

    abstract void work();

    void display() {
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager is managing team");
    }
}

public class A4 {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.display();
        e.work();
    }
}
