package OPPS.Basics.Abstraction.partial;

abstract  class RBI {
    abstract int ROI();
    void welcomemessage(){

        System.out.println("welcome");
    }
    static void termsandconditions(){

        System.out.println("some terms and conditions");
    }

}
    class HDFC extends RBI {
        int ROI(){

            return 1;
        }
        void welcomemessage(){

            System.out.println("welcome to hdfc");
        }
    }
    class SBI extends RBI{
        int ROI(){

            return 6;
        }

    }
class drivecode2{
    public static void main(String[] args){
        HDFC h =new HDFC();
        SBI s=new SBI();
     System.out.println(s.ROI());
        RBI.termsandconditions();
    }
}
