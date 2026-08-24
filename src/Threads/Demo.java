package Threads;

public class Demo {
    public static void main(String[] args){
        System.out.println("main thread started");
        for(int i=0;i<5;i++){
            System.out.println("main thread0."+ i);
        }
        System.out.println("main thread stopped");

    }
}
