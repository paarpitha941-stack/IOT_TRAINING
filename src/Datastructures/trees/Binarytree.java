package Datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Binarytree {

   static Node createnode(int val){
        return new Node(val);
    }

    //DFS TRAVERSAL
    static void  DFS(Node root){
       if(root==null){
           return;
       }
         System.out.print(root.data+" ");//pre-order dfs when we print in frist
         DFS(root.left);
         //System.out.print(root.data+" ");//inoder dfs when data print in middle
         DFS(root.right);
        // System.out.print(root.data+" "); post order dfs when data print in last

    }

    static  void BFS(Node root){
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node front=q.poll();
            System.out.print(front.data +" ");
            if(front.left!=null){
                q.offer(front.left);
            }
            if(front.right!=null){
                q.offer(front.right);
            }
        }
    }
    static int height(Node root){
       if(root==null){
           return 0;
       }
       int leftheight=height(root.left);
       int rightheight=height(root.right);
       return Math.max(leftheight,rightheight)+1;
    }
    public static void main(String[] args) {
       //level1
        Node root=createnode(1);
        //level 2
        root.left=createnode(2);
        root.right=createnode(3);
        //level 3
        root.left.left=createnode(4);
        root.left.right=createnode(5);
        root.right.right=createnode(7);
        root.right.left=createnode(6);
        //level4
        root.left.right.left=createnode(8);
        root.right.left.left=createnode(15);
        root.right.left.right=createnode(9);

        DFS(root);
        System.out.println ();
        BFS(root);
        System.out.println();
        System.out.println(height(root));
    }
}
