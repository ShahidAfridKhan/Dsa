package OldSet.OOPS.linklist;


// Node Class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Insertioninll {
    Node head;
    Node tail;

    // Insert at first
    void insertAtFirst(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    // Display the linked list
    void display() {
        Node i = head;
        while (i != null) {
            System.out.print(i.data + " ");
            i = i.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        Insertioninll l1 = new Insertioninll();

        // Creating nodes manually
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        // Linking nodes manually
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Assigning head and tail
        l1.head = a;
        l1.tail = e;

        // Display initial list
        System.out.println("Initial List:");
        l1.display();

        // Insert at first
        System.out.println("After inserting 3 at FIRST:");
        l1.insertAtFirst(3);
        l1.display();

        // Insert at last
        System.out.println("After inserting 10 at LAST:");
        l1.display();
    }
}
