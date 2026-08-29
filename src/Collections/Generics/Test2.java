package Collections.Generics;

public class Test2<k,v> {
    k key;
    v val;

    Test2(k key,v value){
        this.key=key;
        this.val=value;
    }
}
class driver2{
    public static void main(String[] args){
        Test2<String,Integer> obj=new Test2<>("arpitha",10);
        System.out.println(obj.key);
        System.out.println(obj.val);
    }
}
