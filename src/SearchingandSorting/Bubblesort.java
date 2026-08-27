package SearchingandSorting;

public class Bubblesort {
     static int[] bubblesort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        } return arr;
    }
    public static void main(String[] args){
         int[] arr={12,34,56,23,1,4,6};
        int[] result= bubblesort(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
