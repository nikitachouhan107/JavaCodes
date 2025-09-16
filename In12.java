package Inheritance;

class Car{
    void run(){
        System.out.println("Principal is the head of the school");
    }
}
class Swift extends Car{
    void showDetails(){
        System.out.println("Teacher teaches students");
    }
}
class Honda extends Car{
    void type(){
        System.out.println("Cordinator manages teachers");
    }
}
public class In12{
    public static void main(String[] args){
        Honda h = new Honda();
        h.type();
    }
}