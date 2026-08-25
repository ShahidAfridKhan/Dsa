package OldSet.OOPS.linklist;

public class display {

    public static class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
            //this.next=null;
        }
    }
    public static int count(Node puk){
        int count=0;
        while(puk!=null){
            count++;
            puk=puk.next;
        }
        return count;
    }
    public static void recursive(Node head){
        if(head==null) return;

        System.out.print(head.data+" ");
        recursive(head.next);
    }
    public static Node delete(Node head){
        if(head==null) return head;

        head=head.next;

        return head;


    }



    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(30);
        Node e = new Node(33);
        Node f = new Node(45);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
      //  print(a);
        //System.out.print(count(a));
        Node newhed=delete(a);
        print(newhed);


    }
}