package linklist;

public class Cycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    /*
    public static Node Cycle(int k,Node head){
       // while(k!=0){
            Node current=head;
            Node prev=head;
            while(current.next!=null){
                current=current.next;
                current.next=prev;
            }
        }
        return head;
    }

     */
    public static Node cycle(Node head,int k){
        Node current=head;
        Node prev=null;
            while (current.next != null || k!=0) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            current.next = head;
            head = current;
            k--;
        return head;
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

       Node x=cycle(a,2);
        print(x);
        //System.out.println(cycle(a));
    }
}
