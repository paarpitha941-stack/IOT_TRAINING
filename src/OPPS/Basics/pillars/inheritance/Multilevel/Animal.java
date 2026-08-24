package OPPS.Basics.pillars.inheritance.Multilevel;

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
class puppy extends dog{
    void crying(){
        System.out.println("crying..");
    }
}
class Drivecode{
    public static void main(String[] args){
    Animal a=new Animal();
    dog d=new dog();
    puppy p=new puppy();
    a.eat();
    d.bark();
    d.eat();
    p.crying();
    p.bark();
    p.eat();
    }
}

