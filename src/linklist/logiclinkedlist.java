package linklist;

public class logiclinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void counnt(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
    public static void sumu(Node head){
        Node temp=head;
        int sum=0;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        System.out.println(sum);
    }
    public static boolean search(Node head,int k){
        Node temp=head;

        while(temp!=null){
            if(temp.data==k){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static int max(Node head){
        int max=head.data;
        Node temp=head;
        while(temp!=null){
            if(temp.data>max){
                max=temp.data;
            }
            temp=temp.next;
        }
        return max;
    }
    public static Node sort(Node head){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data>temp.next.data){
                int trrr=temp.data;
                temp.data=temp.next.data;
                temp.next.data=trrr;
            }
            temp=temp.next;
        }
        return head;
    }
    public static int countocc(Node head,int k){
        Node temp=head;
        int count=0;
        while(temp!=null && temp.next!=null){
            if(temp.data==k){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
    public static boolean position(Node a, int pos){
        Node temp=head;
        int count=0;
        if(head==null) return false;
        if(head.next==null) return false;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count<=pos) {
            return true;
        }
        return false;
    }

    public static int suuum(Node head){
        Node temp=head;
        int sum=0;
        int gas=3;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        return sum+gas;
    }
    public static int minn(Node head){
        int min=head.data;
        Node temp=head;
        while(temp!=null){
            if(temp.data<min){
                min=temp.data;
            }
            temp=temp.next;
        }
        return min;
    }
    public static int decimal(Node head){
        if (head==null) return 0;
        if(head.next==null) return head.data;
        Node temp=head;
        int decimal=0;
        while(temp!=null){
            decimal=decimal*2+temp.data;
            temp=temp.next;
        }
        return decimal;
    }
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(0);
        Node c=new Node(1);
        //Node d=new Node(5);
        //Node e=new Node(6);
        a.next=b;
        b.next=c;
        //int f=decimal(a);
        boolean n=position(a,3);
        System.out.println(n);
    }
}
