package Polymorphism;

class Device{
    void use(){
        System.out.println("Device use electricity");
    }
}
class Mobile extends Device{
    void use(){
        System.out.println("Phone is a device");
    }
}
public class P8 {
    public static void main(String[] args){
        Mobile m = new Mobile();
        m.use();
    }
}