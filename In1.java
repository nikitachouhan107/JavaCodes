package Inheritance;

class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void makeSound() {
        System.out.println("Dog bark");
    }
}
public class In1{
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();
    }
}
