package Methods.recursion;

public class functionstack {
    //INFINITE RECURSION

     static void print(int n){
         if(n==100){
             return; //base case
         }
        System.out.println(n);//main body of a recursive function
        print(n+1); //recursive case
    }
    public static void main(String[] args){
         print(1);
    }
}
