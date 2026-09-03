package Datastructures.Graphs.AdacencyList;

import java.util.ArrayList;
import java.util.HashMap;

public class Graphs {
    HashMap<Integer, ArrayList<Integer>>adList;

    Graphs(int vertices){//without declaring we can use the vertices directly in constructor
        adList=new HashMap<>();
        for(int i=0;i<vertices;i++){
            adList.put(i,new ArrayList<>());
        }
    }
    void addedge(int u,int v){
        adList.get(u).add(v);//add v value to u key
        adList.get(v).add(u);//add u value to v key
    }
    void printAdjlist(){
        for(int vertex:adList.keySet()){//vertex gets each key && for each increment automatically
            System.out.print(vertex + "->");
            for(int neighbor:adList.get(vertex)){//neighbor goes inside the value
                System.out.print(neighbor +" ");
            }
            System.out.println( );
        }
    }
}
class drivercode{
    public static void main(String[] args) {
        Graphs g=new Graphs(6);
        g.addedge(0,1);
        g.addedge(0,4);
        g.addedge(0,5);
        g.addedge(1,2);
        g.addedge(1,3);
        g.addedge(1,4);
        g.addedge(2,3);
        g.addedge(3,4);
        g.addedge(4,5);
        g.printAdjlist();

    }
}