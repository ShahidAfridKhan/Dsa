package OldSet.OOPS.DLL;

public class Occurrance {
    public static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
    }
    public static Node head;

    public static Node occdll(Node head,int key){
        Node dummy=new Node(-1);

        dummy.next=head;
        if(head!=null){
            head.back=dummy;
        }
       // head=dummy;
        Node prev=dummy;
        Node current=head;
        while(current!=null){

            Node fast=current.next;
            if(current.data==key){
                prev.next=fast;
                if(fast!=null) {
                    fast.back = prev;
                }
            }else {
                prev = current;
            }
                current = fast;
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
        Node f=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node o=occdll(a,3);
        print(o);
    }

}
