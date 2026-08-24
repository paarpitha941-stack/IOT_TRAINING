package OPPS.Basics.Abstraction.partial;

abstract  class Car {
    abstract void start();
    void brake(){
        System.out.println("car stops");
  }
}
class Bmw extends Car{
    void start(){
        System.out.println("Bmw starts....");
    }


}
class Dreivecode{
    public static void main(String[] args){
        Bmw b=new Bmw();
        b.start();
    }
}