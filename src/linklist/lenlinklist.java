package linklist;

public class lenlinklist {
    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node g){
        while(g!=null){
            System.out.print(g.data+" ");
            g=g.next;
        }
    }
    public static void Length(Node a){
        int count=0;
        while(a!=null){
            count++;
            a=a.next;
        }
        System.out.print(count);
    }


    public static void main(String[] args) {
        Node n=new Node(4);
        Node m=new Node(5);
        Node v=new Node(6);
        Node h=new Node(7);
        Node i=new Node(8);
        Node y=new Node(9);
        n.next=m;
        m.next=v;

        h.next=i;
        i.next=y;

       // Length(n);


        display(n);

    }
}
