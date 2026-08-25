package OldSet.OOPS.linklist;

public class SortList {
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
    public static int SortLL(Node head){
        //if(head==null || head.next==null) return head;

        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        for(int i=0;i<n-1;i++) {
            Node current = head;
            for (int j = 0; j < n - i - 1; j++) {
                if (current.data > current.next.data) {
                    int sup = current.data;
                    current.data = current.next.data;
                    current.next.data = sup;
                }
                current = current.next;
            }
        }
        int unique=1;
        Node neww=head;
        while(neww!=null && neww.next!=null){
            if(neww.data!=neww.next.data){
                unique++;
            }
            neww=neww.next;
        }
        return unique;
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
        Node c=new Node(2);
        Node d=new Node(4);
        Node e=new Node(4);
        Node f=new Node(4);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        //Node x=SortLL(a);
       // print(x);
        System.out.println(SortLL(a));
    }
}
