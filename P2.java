package Polymorphism;

class Printer{
    void print(String text){
        System.out.println("My name is "+text);
    }
    void print(int number){
        System.out.println("I am " +number+" year old.");
    }
}
public class P2{
    public static void main(String[] args){
        Printer p = new Printer();
        p.print("Nikita.");
        p.print(20);
    }
}