package Threads.lambda.withlambda;

public interface greeting {
    void greeting();
}
class Drivercode{
    public static void main(String[] args){
        greeting g=()->{
            System.out.println("hello");
        };
        g.greeting();
    }
}
