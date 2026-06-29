package Problemset;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class StackToLL {
    Node top;

    void push(int val){
        Node NewNode=new Node(val);
        NewNode.next=top;
        top=NewNode;

        System.out.println("Pushed "+val);

    }
    void pop(){
        if(top==null){
            System.out.println("No space to POP");
        }else{
            System.out.println(top.val+" POP");
            top=top.next;
        }
    }
    public static void main(String[] args) {
        StackToLL st=new StackToLL();

        st.push(10);
        st.push(20);
        st.push(30);

        st.pop();
        st.pop();
        st.pop();
        st.pop();

    }
}
