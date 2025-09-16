package Inheritance;

class Vehicle {
    void run(){
        System.out.println("Vehicle run");
    }
}
class Bike extends Vehicle{
    void makeSound() {
        System.out.println("Bike make sound");
    }
}
public class In4{
    public static void main(String[] args){
        Bike b = new Bike();
        b.makeSound();
    }
}
