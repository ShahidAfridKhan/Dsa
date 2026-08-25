package OldSet.OOPS.DLL;
import java.util.*;

public class deleteNodeDLL {

    public static class Node {
        int data;
        Node next;
        Node back;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }

    static Node head = null;

    // Convert array to doubly linked list
    public static Node ArraytoNode(int nums[]) {
        if (nums.length == 0) return null;

        head = new Node(nums[0]);
        Node current = head;

        for (int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i]);
            current.next = newNode;
            newNode.back = current;
            current = newNode;
        }
        return head;
    }

    // Delete head node
    public static Node deleteNode(Node head) {
        if (head == null || head.next == null) return null;

        Node newHead = head.next;
        newHead.back = null;
        head.next = null;

        return newHead;
    }

    // Delete tail node
    public static Node deletetail(Node head) {
        if (head == null || head.next == null) return null;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

        return head;
    }

    // Delete k-th node (1-based index)
    public static Node deleteKth(Node head, int k) {

        if (head == null || k <= 0) return head;

        int count = 1;
        Node temp = head;

        // Move to k-th node
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Invalid k
        if (temp == null) return head;

        Node prev = temp.back;
        Node front = temp.next;

        // Only one node
        if (prev == null && front == null) {
            return null;
        }

        // Delete head
        if (prev == null) {
            head = front;
            front.back = null;
        }
        // Delete tail
        else if (front == null) {
            prev.next = null;
        }
        // Delete middle
        else {
            prev.next = front;
            front.back = prev;
        }

        temp.next = null;
        temp.back = null;

        return head;
    }
    public static Node insertAtStart(Node head, int val) {

        Node newNode = new Node(val);

        if (head != null) {
            newNode.next = head;
            head.back = newNode;
        }

        return newNode;   // new head
    }

    public static Node insertEnd(Node head,int val){

        Node newTail=new Node(val);
        Node temp=head;
        Node prev=temp.back;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newTail;
        newTail.back=temp;

        return head;
    }
   public static Node kthInsert(Node head,int k,int val){
        Node newnode=new Node(val);
        if(k==1){

            newnode.next=head;
            head=newnode;
        }
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;

            if(k==c){
                break;
            }
            temp=temp.next;
        }
        Node prev=temp.back;
        prev.next=newnode;
        temp.back=newnode;
        newnode.next=temp;
        newnode.back=prev;

        return head;

   }
    public static Node InsertKthdata(Node head,int val,int k){
        Node newnode=new Node(val);
        Node temp=head;
        while(temp!=null){
            if(temp.data==k){
                break;
            }
            temp=temp.next;
        }
        Node prev=temp.back;
        prev.next=newnode;
        temp.back=newnode;
        newnode.next=temp;
        newnode.back=prev;

        return head;
    }

    // Print list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        head = ArraytoNode(nums);

        // Example operations
        //head = deleteKth(head, 3);
        //head = insertAtStart(head, 5);
        //head=kthInsert(head,1, 10);
        head=InsertKthdata(head,1000,20);

            print(head);
    }
}
