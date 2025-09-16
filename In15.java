package Inheritance;

class Device{
    void electricity(){
        System.out.println("Device run on electricity");
    }
}
class Moblie extends Device{
    @Override
    void electricity(){
        System.out.println("Mobile is used by all");
    }
}
class Laptop extends Device{
    void electricity(){
        System.out.println("Laptop is used by students");
    }
}
public class In15{
    public static void main(String[] args){
        Moblie m = new Moblie();
        m.electricity();
    }
}
