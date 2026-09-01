package Collections.Linkedlist;




class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL {
    Node1 head;

    DLL() {
        head = null;
    }

    // Insert at head
    void insertAtHead(int val) {
        Node1 n = new Node1(val);

        if (head == null) {
            head = n;
            return;
        }

        n.next = head;
        head.prev = n;
        head = n;
    }

    // Print DLL
    void printDLL() {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Insert at tail
    void insertAtTail(int val) {
        Node1 n = new Node1(val);

        if (head == null) {
            head = n;
            return;
        }

        Node1 temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }

    // Get size
    int getDLLSize() {
        int size = 0;
        Node1 temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // Insert at position
    void insertAtPos(int val, int pos) {
        int size = getDLLSize();

        if (pos < 0 || pos   > size) {
            System.out.println("Invalid position");
            return;
        }

        Node1 n = new Node1(val);

        // Position 0
        if (pos == 0) {
            n.next = head;

            if (head != null) {
                head.prev = n;
            }

            head = n;
            return;
        }

        Node1 temp = head;

        // Move to node before position
        while (--pos > 0) {
            temp = temp.next;
        }

        n.next = temp.next;
        n.prev = temp;

        if (temp.next != null) {
            temp.next.prev = n;
        }

        temp.next = n;
    }
}

class Driver {
    public static void main(String[] args) {

        DLL dll = new DLL();

        dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);

        dll.printDLL();

        dll.insertAtTail(100);
        dll.printDLL();

        dll.insertAtPos(50, 2);
        dll.printDLL();
    }
}