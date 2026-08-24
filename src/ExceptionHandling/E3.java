package ExceptionHandling;

public class E3 {
    public static void main(String[] args){
     int age=46;
     if(age>=18){
         System.out.println("eligible access granted");
     }else{
         throw new RuntimeException("not eligible-access denied");
     }
    }
}
