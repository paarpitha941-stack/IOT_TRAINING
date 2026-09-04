package Datastructures.DyanamicProgramming;

import java.util.Arrays;

public class memorizationfibnocci {
    static int fib(int n,int[] dp){
        if(n==0 || n==1){
            return n; //base case
        }else{//
            //step3 check if ans exists or not
            if(dp[n]!=-1){
                return dp[n];
            }
            //step2 donot return store the array frist!
            dp[n]= fib(n-1,dp)+fib(n-2,dp); // recursive
        }

      return dp[n];
    }
    public static void main(String[] args){
        int n=1000;
        //step1 create a dp array and pass it function
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            System.out.println(fib(i,dp));
        }

    }
}


