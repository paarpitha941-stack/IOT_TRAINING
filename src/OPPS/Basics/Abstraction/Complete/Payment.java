package OPPS.Basics.Abstraction.Complete;

public interface Payment {
    void pay();
    default void refund(){
        System.out.println("Refund");
    }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("paying through the upi");
    }
}
class Creditcard implements Payment {
    public void pay() {
        System.out.println("paying through yhe credit card");

    }
        @Override
        public void refund() {
            System.out.println("this refund");

    }
}
class cash implements Payment{

    public void pay() {
        System.out.println("paying through cash");
    }
}
class drivecode3{
    public static void main(String[] args){
        Payment P=new UPI();
        P.pay();
        Payment P1=new cash();
        P1.pay();
        UPI u=new UPI();
        u.refund();
        Creditcard c=new Creditcard();

    }
}