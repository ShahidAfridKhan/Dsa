package OldSet.OOPS.Stack;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class LLStack {
    Node top;

    void push(int val){
        Node newNode=new Node(val);
        newNode.next=top;
        top=newNode;

        System.out.println(val+ " pushed");
    }

    void pop(){
        if(top==null){
            System.out.println("No space");
        }else{
            System.out.println(top.val+"pop");
            top=top.next;
        }
    }
    /*
    void Queuepush(int val){
        Node top;
        Node newNode=new Node(val);
        top.next=newNode;


    }


     */
    public static void main(String[] args) {
        LLStack l=new LLStack();

        l.push(3);
        l.push(4);

    }
}
