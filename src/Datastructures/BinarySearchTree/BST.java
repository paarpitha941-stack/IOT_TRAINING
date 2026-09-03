package Datastructures.BinarySearchTree;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left= null;
        this.right=null;
    }
}
public class BST {
    Node root;

    BST() {
        root = null;
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void insert(int key) {
        root = insertRec(root, key);

    }

    private boolean searchrec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (key == root.data) {
            return true;
        } else if (key < root.data) {
            return searchrec(root.left, key);
        } else {
            return searchrec(root.right, key);
        }


    }

    boolean search(int key) {
        return searchrec(root, key);
    }

    void inordertraversal(Node root) {
        if (root == null) {
            return;
        }
        inordertraversal(root.left);
        System.out.print(root.data + " ");
        inordertraversal(root.right);
    }

    private Node removerec(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = removerec(root.left, key);
        } else if (key > root.data) {
            root.right = removerec(root.right, key);
        } else {
            //u found node to be deleted
            //case1 Node with 0 or 1
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case2 node with two child
            Node successor =findSuccessor(root.right);
            root.data=successor.data;
            root.right=removerec(root.right,successor.data);
        } return root;
    }
    private Node findSuccessor(Node node){
        while(node.left!=null){
            node=node.left;
        }return node;

}

    void remove(int key){
        root=removerec(root,key);
    }
}

class drivercode{
    public static void main(String[] args  ) {
        BST bt=new BST();
        bt.insert(100);
        bt.insert(50);
        bt.insert(150);
        bt.insert(30);
        bt.insert(60);
        bt.insert(120);
        bt.insert(180);
        bt.insert(55);
        bt.insert(110);
        bt.insert(130);
        bt.inordertraversal(bt.root);
        bt.remove(60);
        bt.remove(120);
        bt.remove(215);//it doest not return anything becouse the fuchion is void type

        System.out.println();
        bt.inordertraversal(bt.root);


    }
}
