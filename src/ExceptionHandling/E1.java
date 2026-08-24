package ExceptionHandling;

public class E1 {
    public static void main(String[] args){
        int i,j,k=0;
        i=10;
        j=2;
        try {
            k = i / j;
            int[] arr={1,2,3,4,5,5};
            System.out.println(arr[99]);
        }
        catch (ArithmeticException a2) {
            System.out.println("can't divide anything by zero");
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("can't the index which is not present in array");
        }

        catch (Exception e) {
            System.out.println("handles any kind of exception which is unkown");
        }finally {
            System.out.println("hello");
        }
    }static{
        System.out.println("execution starts");
    }
}
