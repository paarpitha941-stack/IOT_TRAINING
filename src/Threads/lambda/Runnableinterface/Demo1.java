package Threads.lambda.Runnableinterface;

public class Demo1 {
    public static void main(String[] args){
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        t.run();
    }
}
