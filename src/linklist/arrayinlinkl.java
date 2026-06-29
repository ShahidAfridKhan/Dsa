package linklist;

public class arrayinlinkl {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        //1->2->3->4
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
    }
}
