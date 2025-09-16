package Inheritance;
//Hierachial Inheritance

class Principal{
    void show(){
        System.out.println("Principal is the head of the school");
    }
}
class Teacher extends Principal{
    void showDetails(){
        System.out.println("Teacher teaches students");
    }
}
class Cordinator extends Principal{
    void type(){
        System.out.println("Cordinator manages teachers");
    }
}
public class In11{
    public static void main(String[] args){
       Cordinator c = new Cordinator();
       c.type();
       c.show();
    }
}
