package Inheritance;

class Cloth{
    void material(){
        System.out.println("Bag is used everywhere");
    }
}
class Saree extends Cloth{
    @Override
    void material(){
        System.out.println("Saree is a Indian attire");
    }
}
class Suits extends Cloth{
    void material(){
        System.out.println("Suits is a dress");
    }
}
public class In14{
    public static void main(String[] args){
        Suits s = new Suits();
        s.material();
    }
}

