package Datastructures.GraphTraversal;

import java.text.ParsePosition;
import java.util.*;

public class GraphBFS {
    int v;
    GraphBFS(int v){
        this.v=v;
    }
     ArrayList<Integer>bfstraversal(HashMap<Integer,ArrayList<Integer>>adjList){
        boolean[] visted=new boolean[v];//visited array
         Queue<Integer>q=new LinkedList<>();
         ArrayList<Integer>ans=new ArrayList<>();
            q.offer(0);
            visted[0]=true;
            while(!q.isEmpty()){
                int front=q.poll();
                ans.add(front);
                for(int neighbour : adjList.get(front)){
                    if(!visted[neighbour]){
                        visted[neighbour]=true;
                        q.offer(neighbour);
                    }
                }
            }

           return ans;

     }
}
class Drivercode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of nodes and vertices");
        int n = sc.nextInt();//number of nods
        int e = sc.nextInt();//number of edges;
        //Adjacency list
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }//add edges
        for (int i = 1; i <= e; i++) {
            System.out.println("enter edge " + i + ":");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);

        }
        //print adjlist
        System.out.println("AdjList:");
        for (int i : adjList.keySet()) {
            System.out.println(i + "->" + adjList.get(i));
        }

       GraphBFS bfs=new GraphBFS(n);
        ArrayList<Integer> ans=bfs.bfstraversal(adjList);
        System.out.println("bfs traversal");
        for(int i :ans){
            System.out.println(i+" ");
        }
    }
}
