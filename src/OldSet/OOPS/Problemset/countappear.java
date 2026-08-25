package OldSet.OOPS.Problemset;

public class countappear {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static int occ(Node head,int k){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==k){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
    public static Node delete1st(Node head,int k){
        if(head==null) return head;

        if(head.data==k) {
            return head.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==k){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
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

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        Node y=delete1st(a,1);

        print(y);
        //System.out.print(delete1st(a,1));

    }
}
