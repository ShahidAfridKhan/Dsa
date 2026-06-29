package linklist;

public class Leetcode2487GreaterNode {
    public static class Node{
        int data;
        Node next;

        Node(int data){

            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; // Return the new head
    }

//    public static Node removeGreaterNode(Node head) {
//        if (head == null || head.next == null) return head;
//
//        // Step 1: Reverse the list
//        head = reverse(head);
//
//        Node current = head;
//        while (current != null && current.next != null) {
//            if (current.next.data < current.data) {
//                current.next = current.next.next;
//            } else {
//
//                current = current.next;
//            }
//        }
//
//        return reverse(head);
//    }
    public static Node reverseee(Node head){
        Node revehead=reverse(head);
        Node current=revehead;
        while(current!=null && current.next!=null){
            if(current.next.data<current.data ){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return reverse(revehead);
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
        Node b=new Node(1);
        Node c=new Node(8);
        Node d=new Node(1);
        Node e=new Node(13);
        Node f=new Node(8);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node x=reverseee(a);
        print(x);

    }
}
