package OPPS.Basics.polymorphism.CompileTime;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }
}
class Drivercode{
    public static void main(String[] args){
        Addition a1=new Addition();
        System.out.println(a1.add(2,4,5));
        System.out.println(a1.add(2,4));
        System.out.println(a1.add(2.0f,-6.0f,9.0f));
    }
}
