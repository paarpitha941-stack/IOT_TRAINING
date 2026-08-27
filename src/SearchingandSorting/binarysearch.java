package SearchingandSorting;

public class binarysearch {
    static int Binarysearch(int arr[], int key){
        int f=0;
        int l=arr.length-1;
        while(f<l){
            int mid=(f+l)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                 f=mid+1;
            }else{
                 l=mid-1;
            }
        }
       return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
         int key=7;
          int result=Binarysearch(arr,key);
          if(result!=-1){
              System.out.println("key found"+ result);
          }
          else{
              System.out.println("key not found" + result);
          }

    }
}
