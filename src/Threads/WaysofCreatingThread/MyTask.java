package Threads.WaysofCreatingThread;

 class MyTask implements Runnable {
     public void run(){
         System.out.println("Thread is running");
     }
}
class MyTask2 implements Runnable {
    public void run(){
        System.out.println("Thread is running......");
    }
}
class Domo1{
    public static void main(String[] args){
        MyTask task=new MyTask();
        MyTask2 task1=new MyTask2();
        Thread t1= new Thread(task);
        Thread t2=new Thread(task1);
        t1.start();
        t2.start();
        System.out.println("main thread");
    }
}
