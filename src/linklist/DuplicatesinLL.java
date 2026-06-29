package linklist;

public class DuplicatesinLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

    public static Node Duplicate(Node head){
        Node dummy=new Node(-1);
        Node prev=dummy;
        dummy.next=head;
        Node current=head;
        while(current!=null){
            if(current.next!=null && current.data==current.next.data){
                int duplicate=current.data;
                while(current!=null && current.data==duplicate){
                    current=current.next;
                }
                prev.next=current;
            }else{
                prev=current;
                current=current.next;
            }
        }
        return dummy.next;
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
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(4);
        Node g=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        Node x=Duplicate(a);
        print(x);

    }
}