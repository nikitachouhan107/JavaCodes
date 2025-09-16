package Inheritance;

class Shape{
    void details(){
        System.out.println("Shape are well defined");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Area of circle");
    }
}
public class In5{
    public static void main(String[] args){
        Circle c = new Circle();
        c.area();
    }
}