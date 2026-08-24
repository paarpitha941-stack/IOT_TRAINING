package OPPS.Basics.Abstraction.Complete;

public interface Mom {
     void cook();

}
interface dad{
    void cook();
}
class child implements Mom,dad{
    @Override
    public void cook() {
        System.out.println("indian");
    }
}
class drivecode{
    public static void main(String[] args){
        child c1=new child();
        c1.cook();
    }
}