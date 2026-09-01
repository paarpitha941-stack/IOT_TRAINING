package Collections.Queses;

public class Queue {
    int[]arr;
    int size;
    int front;
    int back;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        back=-1;
    }
    void push(int val){
        if(back==size-1){
            System.out.println("overflow");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1){
            front++;
        }
    }
    void pop() {
        if (front == -1 || front > back) {
            System.out.println("underflow");
            return;
        }
        arr[front] = 0;
        front++;
    }
    int peek(){
        if(front==-1||front>back){
            System.out.println("underflow");
            return -1;
        }
        return arr[front];
    }

     boolean isEmpty(){
        return(front==-1||front>back);
     }
     void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

     }
    }
    class drivercode{
    public static void main(String[] args) {
        Queue q1=new Queue(5);
        q1.push(10);
        q1.push(2);
        q1.push(4);
        q1.push(34);
        q1.push(5);
        System.out.println("pushed elemnta");
        q1.print();
        q1.pop();
        q1.pop();
        q1.pop();
        System.out.println("after popping");
        q1.print();
        System.out.println("peek elemnt");
        q1.peek();
        System.out.println(q1.peek());
        System.out.println(q1.isEmpty());

    }
    }

