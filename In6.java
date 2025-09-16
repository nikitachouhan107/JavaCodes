package Inheritance;
//Multilevel with override

class Planet{
    void number(){
        System.out.println("There are 8 planets");
    }
}
class Mars extends Planet{
    @Override
    void number(){
        System.out.println("Mars is red in color");
    }
}
class Earth extends Planet{
    @Override
    void number(){
        System.out.println("Life exsist only on Earth");
    }
}
public class In6{
    public static void main(String[] args){
        Mars m = new Mars();
        m.number();
    }
}
