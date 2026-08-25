/*
package OldSet.OOPS.linklist;

public class deletion {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node del(Node head) {

        if (head == null) return head;
        head = head.next;

        return head;

    }

    public static void print(Node val) {

        while (val != null) {
            System.out.print(val.data + " ");
            val = val.next;
        }

    }

    public static Node delete(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }
    /*
    public static Node positiondel(Node head,int k) {
        if (head == null) return head;
        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = head;

        while (temp != null) {
            count++;
        }
        if (k == count) {
            prev.next = prev.next.next;
            break;
        }
        prev = temp;
        temp = temp.next;
        return head;
    }

}
    public static void main(OldSet.OOPS.String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        //Node newhed=delete(a);
        //print(newhed);


        //System.out.println(ans);
    }
}


 */