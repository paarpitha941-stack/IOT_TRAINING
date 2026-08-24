package Methods.recursion;

public class Fibonacci {
    static int fib(int n){
        if(n==0 || n==1){
            return n; //base case
        }else{
            return fib(n-1)+fib(n-2); // recursive
        }


    }
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<10;i++){
            System.out.println(fib(i));
        }

    }
}
