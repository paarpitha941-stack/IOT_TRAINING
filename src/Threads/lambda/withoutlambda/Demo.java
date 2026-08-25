package Threads.lambda.withoutlambda;

interface greeting{
    void greet();
}
class drivecode{
    public static void main(String[] args){
        greeting g=new greeting() {
            @Override
            public void greet() {
                System.out.println("hello");
            }
        };
        g.greet();
    }
}
