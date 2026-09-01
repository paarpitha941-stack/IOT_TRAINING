package Collections.Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL() {
        head = null;
    }

    // Insert at head
    void insertAtHead(int val) {
        Node n = new Node(val);

        n.next = head;
        head = n;
    }

    // Print SLL
    void printSLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Insert at tail
    void insertAtTail(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
    }

    // Get size
    int getSLLSize() {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Insert at position
    void insertAtPos(int val, int pos) {
        int size = getSLLSize();

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        Node n = new Node(val);

        // Insert at position 0
        if (pos == 0) {
            n.next = head;
            head = n;
            return;
        }

        Node temp = head;

        // Move to node before the position
        while (--pos > 0) {
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("linked kist is empty");
            return;
        }
        Node todelete=head;
        head=head.next;
        todelete=null;//call garbage collector
    }
    void deleteAttail(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void deletebyvalue(int val){
        if(head==null) {
            System.out.println("linked list is empty");
            return;
        }
        if(head.data==val){
            Node todelete=head;
            head=head.next;
            return;
        }
        Node temp=head;

        while(temp.next!=null && temp.next.data!=val){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("value is not found");
            return;
        }
        Node todelete=temp.next;
        temp.next=temp.next.next;
        todelete=null;


    }

}

class Drivercode {
    public static void main(String[] args) {

        SLL sll = new SLL();

        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);

        sll.printSLL();

        sll.insertAtTail(100);

        sll.printSLL();

        sll.insertAtPos(50, 2);

        sll.printSLL();
        sll.deletebyvalue(30);
        sll.printSLL();
        sll.deleteAttail();
        sll.printSLL();
    }
}