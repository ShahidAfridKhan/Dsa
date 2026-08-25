package OldSet.OOPS.Problemset;

public class InbuiltCode {
   public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class Main {
        public static void main(String[] args) {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);

            int x = 40;

            head = insertAtEnd(head, x);

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static Node insertAtEnd(Node head, int x) {
            // write your code here
            Node newNode=new Node(x);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return head;
        }
    }
}
