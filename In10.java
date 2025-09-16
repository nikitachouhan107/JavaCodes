package Inheritance;

class Bank{
    void account(){
        System.out.println("Bank creates account");
    }
}
class BOB extends Bank{
    void type(){
        System.out.println("BOB is Bank of Baroda");
    }
}
class PNB extends BOB{
    void savings(){
        System.out.println("PNB is Punjab National Bank");
    }
}
public class In10{
    public static void main(String[] args){
        PNB p = new PNB();
        p.savings();
        p.type();
        p.account();
    }
}
