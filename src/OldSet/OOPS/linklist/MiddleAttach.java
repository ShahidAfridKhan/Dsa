/*
package OldSet.OOPS.linklist;

public class MiddleAttach {
    public static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;


        public static Node reverse(Node a){
            Node current=head;
            Node prev=null;
            while(current!=null){
                Node dummy=current.next;
                current.next=prev;
                prev=current;
                current=dummy;
            }
            return prev;
        }
        public static boolean halfreverse(Node head){
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            reverse(slow.next);
            Node second=slow.next;
            Node first=head;

            if(first.data!=second.data){
                reverse(slow.next);
                return false;
            }
            reverse(slow.next);
            return true;
        }


    public static Node middleof(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            //  Node solwdummy=slow;
            slow = slow;//1 2 (3)slow 4 5 6-->fast
            fast = fast.next.next;
        }

        Node current = slow.next;//1 2 (3)slow (4)current 5 6-->fast
        Node prev = null;//prev---->null

        while (current != null) {
            Node dummy = current.next;//1 2 (3)slow (4)current (5)dummy 6-->fast
            current.next = prev;
            prev = current;
            current = dummy;//1 2 3 4 5 6 o/p=1 2 3 6 5 4
        }
        // prev.next=null;
        slow.next = prev;
        return head;
    }

    public static Node swap(Node a){
        Node temp=head;
        Node temp1=temp.next;
        while(temp!=null && temp1!=null){
            if(temp.data<temp1.data){
                swap(temp,temp1);
            }
        }
        return head;
    }
    public static void swap(Node a,Node b){
        int temp=a.data;
        a.data=b.data;
        b.data=temp;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(OldSet.OOPS.String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        /*
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);



        a.next = b;
        /*
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;



        //Node x=halfreverse(a);
        //print(x);
        // System.out.println(halfreverse(a));
        //Node x = middleof(a);
        Node x=swap(a);
        print(a);


    }
}


 */