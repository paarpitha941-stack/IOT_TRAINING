package Datastructures.GraphTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GraphDFS {
    int v;
    GraphDFS(int v){

        this.v=v;
    }
    private void dfsrec(int srcnode, HashMap<Integer,ArrayList<Integer>>adjList,boolean[] visited,ArrayList<Integer>ans){

        visited[srcnode]=true;
        ans.add(srcnode);
        for(int neighbour :adjList.get(srcnode)){
            if(!visited[neighbour]){
                dfsrec(neighbour,adjList,visited,ans);
            }

        }
    }
    ArrayList<Integer>dfstraversal(HashMap<Integer,ArrayList<Integer>>adjlist){
     boolean[] visted =new boolean[v];
     ArrayList<Integer>ans=new ArrayList<>();
     dfsrec(0,adjlist,visted,ans);
     return ans;
    }
}
class drivercode{
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
    //CALL DFSTRAVERSAL
    GraphDFS bfs=new GraphDFS(n);
    ArrayList<Integer> ans=bfs.dfstraversal(adjList);
        System.out.println("DFS traversal");
        for(int i :ans){
        System.out.println(i+" ");
          }

}
}
