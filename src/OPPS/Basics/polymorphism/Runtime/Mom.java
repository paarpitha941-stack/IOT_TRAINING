package OPPS.Basics.polymorphism.Runtime;

public class Mom {
    void cook(){
        System.out.println("Indian");
    }
}
class Daughter extends Mom{
    void cook(){
        System.out.println("chinese");
    }
}
class DriverCode{
    public static void main(String[] args){
        Mom m=new Mom();
        Daughter d=new Daughter();
        d.cook();

    }
}
