package ARRAYS.Basics;

public class SumOfElements {
    public static void main(String[] args){
        int sum=0;
        int [ ] arr={1,2,34,5,6};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
