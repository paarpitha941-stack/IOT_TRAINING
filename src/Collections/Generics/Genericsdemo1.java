package Collections.Generics;

import java.util.ArrayList;

public class Genericsdemo1 {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList();
        list.add(110);
//        list.add("Abc");compile time error
        System.out.println(list);
    }
}
