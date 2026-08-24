package OPPS.Basics.pillars.inheritance.hierrachial;


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
class cat extends Animal{
    void meow(){
        System.out.println("meow....");
    }
}
    class Drivecode{
    public static void main(String[] args){
    Animal a=new Animal();
    dog d=new dog();
    cat c=new cat();
    a.eat();
    d.bark();
    d.eat();
    c.meow();
    c.eat();

    }
}
