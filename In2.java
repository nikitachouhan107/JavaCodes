package Inheritance;

class Book {
    void read(){
        System.out.println("I read book");
    }
}
class Novel extends Book{
    void write() {
        System.out.println("Novels are good");
    }
}
public class In2{
    public static void main(String[] args){
        Novel n = new Novel();
        n.write();
    }
}

