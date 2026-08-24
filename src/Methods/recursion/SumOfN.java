package Methods.recursion;

public class SumOfN {

    static int sum(int n) {
        if (n == 1) {
            return 1; //base case
        } else {
            return n +sum(n - 1);//recursive part
        }
    }

    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);

    }
}