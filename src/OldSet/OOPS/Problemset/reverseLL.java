package OldSet.OOPS.Problemset;

public class reverseLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node reverse(Node head){
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node dummy=current.next;
            current.next=prev;
            prev=current;
            current=dummy;
        }
        return prev;
    }
    public static int middle(Node head) {
        if (head == null) return -1;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static boolean cycle(Node head){
        Node slow=head;
        Node fast=head;
        // int cont=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       // Node r=reverse(a);
        //print(r);
        System.out.println(cycle(a));
    }
}
