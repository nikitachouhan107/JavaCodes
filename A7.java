package Abstraction;

abstract class University {
    abstract void course();
}

class Engineering extends University {
    void course() {
        System.out.println("Engineering Course");
    }
}

public class A7 {
    public static void main(String[] args) {
        University u = new Engineering();
        u.course();
    }
}

