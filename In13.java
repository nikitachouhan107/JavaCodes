package Inheritance;

class Bag{
    void material(){
        System.out.println("Bag is used everywhere");
    }
}
class Suitcase extends Bag{
    void showDetails(){
        System.out.println("Suitcase is used for travelling");
    }
}
class Breifcase extends Bag{
    void type(){
        System.out.println("Breifcase is used");
    }
}
public class In13{
    public static void main(String[] args){
        Suitcase s1 = new Suitcase();
        s1.showDetails();
    }
}
