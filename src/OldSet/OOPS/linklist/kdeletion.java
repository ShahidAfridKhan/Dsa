package OldSet.OOPS.linklist;

public class kdeletion {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    public static Node dele(Node g,int k){
        if(g==null) return g;
        if(k==1) return g;
        Node prev=null;
        int count=0;
        Node temp=g;
        while(temp!=null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return g;
    }
    public static Node headrem(Node head){
        if(head==null) return null;
        if(head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node oddNode(Node head){
        Node Main;
        Node odd=head;
        Node even=odd.next;
        while(odd!=null && even!=null){
            odd=odd.next;
            even=even.next;
        }
        Main=odd;
        odd.next=even;
        return Main;
    }
    public static Node rasicsm(Node head){
        if(head==null && head.next==null) return head;

        Node odd=head;
        Node even=odd.next;
        Node evenhead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next =odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    public static Node remm(Node head,int k){
        Node temp=head;
        if(head==null) return null;
        Node prev=null;
        while(temp!=null){
            if(temp.data==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node listele(Node head,int val){
        Node temp=head;
        Node prev=null;
        if(temp.data==val) return null;
        while(temp!=null){
            if(temp.data==val){
                prev.next=prev.next.next;
                //break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node firstimp(Node head, int k){
        Node tem=new Node(k);

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=tem;
        return head;
    }
    public static Node mid(Node head){
        Node fast=head;
        Node slow=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node kthele(int k,int ele,Node head){
        Node temp=head;
        if(head==null) return null;
        int counter =0;
        Node prev=null;
        while(temp!=null) {
            counter++;
            if (counter == k) {
                Node x = new Node(ele);
                prev.next = x;
                x.next=temp;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node current=head;
       Node next;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        return prev;
    }
    public static Node reverseremove(Node head, int k){
        Node temp = head;
        if(head == null) return head;

        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;   // you fixed this 👍
        }

        int n = count - k + 1;   // position from start to delete

        // 🔥 Mistake 1: Node index = 0;  ❌
        // Should be integer
        int index = 1;           // start from position 1

        // 🔥 pointers
        Node prev = null;
        Node temp2 = head;

        while(temp2 != null){

            // 🔥 Compare index with n, not nodes
            if(index == n){
                // if deleting first node
                if(prev == null) return temp2.next;
                prev.next = temp2.next;
                break;   // stop after deleting
            }

            prev = temp2;
            temp2 = temp2.next;
            index++;       // increment index each step
        }

        return head;
    }


    public static void print(Node d){
        while(d!=null){
            System.out.print(d.data+" ");
            d=d.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(31);
        Node b=new Node(32);
        Node c=new Node(33);
        Node d=new Node(34);
        Node e=new Node(35);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        //Node f=reverseremove(a,1);
        //Node f=swap(a);
        //print(f);

    }
}
