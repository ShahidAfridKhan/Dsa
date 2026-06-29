package linklist;

public class leetcode92Leftrightlist {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static Node head;
    public static Node reverseBetween(Node head,int left,int right){
        Node dummyNode=new Node(-1);
        Node prev=dummyNode;
        dummyNode.next=head;
        Node current=head;
        for(int i=1;i<left;i++){
            prev=prev.next;
            current=current.next;
        }
        Node joinlist=current;
        Node prevnull=null;
        int n=right-left+1;
        for(int i=0;i<n;i++){
            Node currentnext=current.next;
            current.next=prevnull;
            prevnull=current;
            current=currentnext;
        }
        prev.next=prevnull;
        joinlist.next=current;
        return dummyNode.next;

    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

     Node x=reverseBetween(a,2,4);
     print(x);
    }
}
