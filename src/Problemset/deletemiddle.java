package Problemset;

public class deletemiddle {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node middle(Node head){
        Node fast=head;
        Node slow=head;
        int cnt=1;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==slow.data){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node middle2(Node head){
        //Node fast=head;
        Node slow=head;
       Node fast=head.next.next;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
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
        Node f=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        e.next=f;
        Node m=middle2(a);
        print(m);

    }
}
