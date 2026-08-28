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
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int[] result= bubblesort(arr);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
