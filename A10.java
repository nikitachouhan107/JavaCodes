package Abstraction;

abstract class Book {
    abstract void details(); // abstract method
}

class Novel extends Book {
    void details() {
        System.out.println("This is a Novel. Genre: Fiction");
    }
}
public class A10 {
    public static void main(String[] args) {
        Book b1 = new Novel();
        b1.details();
    }
}
