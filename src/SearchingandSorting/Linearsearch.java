package SearchingandSorting;

public class Linearsearch {
    static int linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]arr={10,11,1,7,9,13};
        int key=7;
        int result=linearsearch(arr,key);
        if(result!=-1){
            System.out.println("key is found" + result);
        }else{
            System.out.println("key is not found" + result);
        }
    }
}
