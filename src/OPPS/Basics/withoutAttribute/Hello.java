package OPPS.Basics.withoutAttribute;

public class    Hello {
    static void printhello(){
        System.out.println("Hello");
    }
//    public static void main(String[] args){
//        printhello();
//    }
}
//we can also write the main in separete class
class Drive{
    public static void main(String[] args){
        Hello.printhello();
    }
}
