package Inheritance;

class Food{
    void eat(){
        System.out.println("I eat food");
    }
}
class Italian extends Food{
    void type(){
        System.out.println("Italian is a type of food");
    }
}
public class In3{
    public static void main(String[] args){
        Italian i = new Italian();
        i.type();
    }
}