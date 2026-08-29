package Collections.Linkedlist;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Node head;
    SLL(){
        head=null;
    }
     void insertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;


    }
    void printSLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void inserttail(int val){
        Node n=new Node(val);
        if(head==null) {
            head = n;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=n;



    }
    int getLLsize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    void insertAtpos(int val,int pos){
        Node n=new Node(val);
        int size=getLLsize();
        if(pos<0 ||pos>size){
            System.out.println("get lost");

        } else if (pos==0) {
            n.next=head;
            head=n;

        } else{

     Node temp=head;
     while(--pos>0){
         temp=temp.next;

     }
     n.next=temp.next;
     temp.next=n;
    }

}
class Driver3{
    public static void main(String[] args){
        SLL sll=new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.printSLL();
        sll.inserttail(1100);
        sll.printSLL();
        sll.insertAtpos(10,100);
        sll.printSLL();
        sll.insertAtpos(123,24);
        sll.printSLL();
    }

