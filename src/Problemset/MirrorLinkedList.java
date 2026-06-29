package Problemset;

public class MirrorLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

//your code
    public static Node Mirror(Node head,int k){
        Node current=head;
        Node prev=null;
        Node currenthead=head;
        while(current.data!=k){
            Node dummy=current.next;
            current.next=prev;
            prev=current;
            current=dummy;
        }
        currenthead.next=current;
        head=prev;
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(5);
        Node d=new Node(7);
        Node e=new Node(9);
        Node f=new Node(11);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node x=Mirror(a,7);
        print(x);
        //System.out.print(Mirror(a,4));
    }
}
