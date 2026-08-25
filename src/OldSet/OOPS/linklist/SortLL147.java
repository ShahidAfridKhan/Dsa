package OldSet.OOPS.linklist;

public class SortLL147 {
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
    public static Node Recruter(Node head){
        Node current=head;
        while(current!=null && current.next!=null){
            Node next=current.next;
            if(current.data>next.data){
                int temp=current.data-next.data;
                Node dummyNode=new Node(temp);
                current.next=dummyNode;
                dummyNode.next=next;
                current=next;
            }
            current=current.next;
        }
        return head;
    }
    class Solution {
        public Node insertionSortList(Node head) {

            Node dummy = new Node(0); // sorted list dummy
            Node curr = head;

            while (curr != null) {
                Node next = curr.next;   // save next node
                Node prev = dummy;

                // find correct position
                while (prev.next != null && prev.next.data < curr.data) {
                    prev = prev.next;
                }

                // insert node
                curr.next = prev.next;
                prev.next = curr;

                curr = next;
            }

            return dummy.next;
        }
    }
/*
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right, and return the reversed list
 */
    public static Node paration(Node head,int x){
        Node current=head;
        Node prev =new Node(-1);
        Node newprev=null;
        while(current!=null && current.next!=null){
            Node first=current.next;
            if(current.data<x){
                Node dummy=prev;
                prev.next=current;
                if(first!=null) {
                    current.next = first;
                }
                    current.next=newprev;
                dummy=current;
            }
            newprev=current;
            current=current.next;
        }
        return prev.next;
    }
    public static Node reverseList(Node head,int time){
        Node prev=null;
        while(time>=0){
            Node current=head;
        while(current!=null){
            Node dummy=current.next;
            current.next=prev;
            prev=current;
            current=dummy;
            time--;
        }
        }
        return prev;
    }
    public static Node reverseeList(Node head, int time) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null && time > 0) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            time--;
        }

        // connect remaining list
        head.next = current;

        return prev; // new head
    }
    public static Node reverseII(Node head,int left,int right){
        Node current=head;
        int count=1 ;
        Node prev=null;
        Node leftone=null;
        Node rightone=null;
        Node rightconnect=null;
        Node connect=null;
        while(current!=null){
            count++;
            if(count==left){
                connect=current;
                leftone=current;
                prev.next=leftone;
            }if(count==right){
                rightone=current;
                rightone.next=rightconnect;
            }
            current=current.next;
        }
        while(leftone!=rightone){
            prev.next=null;
            rightone.next=null;
            Node leftdummy=leftone.next;
            leftdummy.next=leftone;
            leftone=leftdummy;
        }
        prev.next=leftone;
        connect.next=rightconnect;

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



        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       Node x=reverseII(a,2,4);
       print(x);
       // System.out.println(reverseII(a,2,4));

    }
}
