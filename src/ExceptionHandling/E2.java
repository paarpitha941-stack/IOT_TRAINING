package ExceptionHandling;

public class E2 {
    public static void main(String[] args){
        int i=10,j,k=0;
        j=2;
        try{
            k=i/j;
            int[] array={1,2,3,4,5};
            System.out.println(array[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("hello");

    }
}
