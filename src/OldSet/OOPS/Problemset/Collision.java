package OldSet.OOPS.Problemset;
public class Collision {
    public static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node cycle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                Node start=head;
                while(start!=slow){
                    start=start.next;
                    slow=slow.next;
                }
                return start;
            }
        }
        return null;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(4);
        Node d=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;

        //System.out.println(cycle(a));



    }

}
