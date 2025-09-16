package Inheritance;

class School{
    void name(){
        System.out.println("Students goes to school");
    }
}
class College extends School{
    @Override
    void name(){
        System.out.println("After school students goes to college");
    }
}
class Job extends School{
    @Override
    void name(){
        System.out.println("Job is important");
    }
}
public class In7 {
    public static void main(String[] args){
        Job j = new Job();
        j.name();
    }
}