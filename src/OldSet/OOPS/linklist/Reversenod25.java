package OldSet.OOPS.linklist;

public class Reversenod25 {
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
    public static Node reversekgroup(Node head,int k){
        Node first=head;
        Node second=first.next;
        //Node prev=null;
        int counter=1;
        while(second!=null&&second.next!=null){
            counter++;
            if(counter==k){
                Node dummy=second.next;
                second.next=first;
                first.next=dummy;

                first=dummy;
                if(first.next!=null){
                    second=first.next;
                }
                counter--;
            }
            //prev=first;
            first=first.next;
            second=second.next;
        }
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
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        //Node f=new Node(6);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
      //  e.next=f;
        Node x=reversekgroup(a,2);
        print(x);
    }
}
