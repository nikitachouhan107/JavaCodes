package Polymorphism;

class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Area of Square = side²");
    }
}

public class P9{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.area();
        s2.area();
    }
}

