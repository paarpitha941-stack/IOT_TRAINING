package Collections.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;
    Stack( int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int val){
        if(top==size-1){
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }
        arr[top]=0;
        top--;
    }
    int Top(){
       if(top==-1){
           System.out.println("underflow");
           return -1;
       }
       return arr[top];
    }
    boolean empty(){
        return top==-1;
    }
    void print(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
class driver{
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(10);
        s.push(4);
        s.push(15);
        s.push(31);
        s.push(11);
        s.print();
        System.out.println(s.Top());
        s.pop();
        System.out.println(s.Top());
        s.print();


    }
}