package Datastructures.DyanamicProgramming;

class TabulationFibnooci {
    public static void main(String[] args) {
        int n = 100;
        //step1 create a dp array
        int[] dp = new int[n];
        //step2
        dp[0] = 0;
        dp[1] = 1;
        //step3
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        //step 4
        System.out.println("fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.println(dp[i] + " ");
        }

    }
}
