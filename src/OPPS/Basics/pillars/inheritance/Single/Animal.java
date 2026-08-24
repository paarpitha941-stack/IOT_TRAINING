package OPPS.Basics.pillars.inheritance.Single;

public class Animal {
    void eat(){
        System.out.println("eating....");
    }
}
class dog extends Animal {
    void bark() {
        System.out.println("barking....");
    }
}
    class Drivecode{
    public static void main(String[] args){
    Animal a=new Animal();
    dog d=new dog();
    a.eat();
    d.bark();
    d.eat();
    }
}
