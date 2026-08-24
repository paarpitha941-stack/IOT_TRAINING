package Threads.WaysofCreatingThread;

        class Mythread extends Thread {
            public void run() {
                for(int i = 0; i <= 5; i++) {
                    System.out.println("my thread is running" + i);
                }
            }
        }
class demo {
    public static void main(String[] args) {
        Mythread t1=new Mythread();

        t1.start();
        for(int i = 0; i <= 5; i++) {

            System.out.println("main thread" + i);
        }


    }

}

