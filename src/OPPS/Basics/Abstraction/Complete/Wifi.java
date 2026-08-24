package OPPS.Basics.Abstraction.Complete;

public interface Wifi {
    void connect();

}
class laptop implements Wifi{
    public void connect(){


        System.out.println("laptop is connected to wifi");
    }
} class phone implements Wifi{
    public void connect(){

        System.out.println(" phone is  connected to wifi");
    }
}
class Drivecode{
    public static void main(String[] args){
        laptop l=new laptop();
        phone p=new phone();
        l.connect();
        p.connect();


    }
}
