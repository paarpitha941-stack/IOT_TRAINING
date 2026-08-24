package Methods.recursion;

//public class callbyvalue {
//     static void swap(int a, int b){
//         int temp =a;
//         a = b;
//         b = temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
//    public static void main(String[] args){
//        int a=12;
//        int b=3;
//        swap(a,b);
//
////    }
//}


public class callbyvalue {
    static void swap(int[] arr){
        int temp =arr[0];
        arr[0]=arr[1];
        arr[1]= temp;

    }
    public static void main(String[] args){
        int[] arr={10,20};
        swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}
