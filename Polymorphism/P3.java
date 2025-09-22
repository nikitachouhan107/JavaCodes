package Polymorphism;

class Student {
    void info(String name) {
        System.out.println("Name: " + name);
    }

    void info(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class P3{
    public static void main(String[] args) {
        Student s = new Student();
        s.info("Nikita");
        s.info("Nikita", 21);
    }
}

