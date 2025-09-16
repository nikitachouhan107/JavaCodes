package Inheritance;

class Account{
    void details(){
        System.out.println("I have an account");
    }
}
class Saving extends Account{
    void type(){
        System.out.println("I have a saving account");
    }
}
class FD extends Saving{
     void savings(){
        System.out.println("FD means fixed deposit");
    }
}
public class In9{
    public static void main(String[] args){
        FD fd = new FD();
        fd.details();
        fd.type();
        fd.savings();
    }
}
