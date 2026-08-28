package SearchingandSorting;

public class Selectionsort {
    static int[] selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
             int min=i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[min]){
                     min=j;
                 }
             }
             int temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
        }
        return arr;

    }
    public static void main(String[] args){
        int[]arr={5,2,8,1,30};
       int[] result= selectionsort(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(" "+ result[i]);

        }
    }
}
