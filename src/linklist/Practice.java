package linklist;

public class Practice {

    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head=null;
    Node tail=null;

    void Insert(int val){
        Node temp=new Node(val);
        if(head==null){

            temp=head=tail;
        }else{

            temp.next=head;
            head=temp;


        }
    }
    static void print(Node a){

        while(a!=null){
            System.out.print(a.data+" ");

            a=a.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);

        a.next=b;
        b.next=c;

        //print(a);

        Practice p1=new Practice();

        p1.Insert(6);

        print(a);

    }
}
