package Threads.lambda.Runnableinterface;

public class Demo {
    public static void main(String[] args){
        Runnable task =new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is running");
            }
      };
//        Runnable task = ()->{
//            System.out.println("thread is running");
//        };
    }
}
