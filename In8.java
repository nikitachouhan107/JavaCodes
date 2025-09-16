package Inheritance;

class Student{
    void details(){
        System.out.println("I am students");
    }
}
class Undergraduate extends Student{
    @Override
    void details(){
        System.out.println("I am undergraduate");
    }
}
class Graduate extends Student{
    @Override
    void details(){
        System.out.println("I have a graduate degree");
    }
}
public class In8{
    public static void main(String[] args){
        Undergraduate u = new Undergraduate();
        u.details();
    }
}