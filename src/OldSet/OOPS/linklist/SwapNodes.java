package OldSet.OOPS.linklist;

public class SwapNodes {
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
    /*
    public static Node compare(Node a){
        Node first=head;
        Node second=first.next;
        while(first!=null && first.next.next!=null){
            if(first.data<second.data){
                swap(first,second);
            }
        }
        return head;
    }

     */
    public static Node Reorder(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node current=slow.next;
        slow.next=null;
        Node prev=null;
        while(current!=null){
            Node dummy=current.next;
            current.next=prev;
            prev=current;
            current=dummy;
        }
        slow.next=prev;
        Node first=head;
        Node second=slow.next;
        while(second!=null){
            Node t1=first.next;
            Node t2=second.next;

            first.next=second;
            second.next=t1;
            second=t2;
        }
        return head;
    }
  public static void swap(Node head,Node sec){
      Node first=head;
      Node second=first.next;

      while(first!=null && second!=null) {
          if (first.data < second.data) {
              int temp = first.data;
              first.data = second.data;
              second.data = temp;
          }
          first = second.next;
          if (first != null) {
              second = first.next;
          } else {
              break;
          }
          second = first.next;
      }
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
        Node f=new Node(6);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node x=Reorder(a);
        print(x);
    }
}
