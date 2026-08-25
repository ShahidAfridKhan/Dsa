package OldSet.OOPS.Queue;


class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class QueueLL {

    Node start=null;
    Node end=null;

    int currentcount=0;
    void push(int val){
        Node newNode=new Node(val);

        if(currentcount==0){
            start=end=newNode;
        }else{
            end.next=newNode;
            end=newNode;
        }
        currentcount++;
        System.out.println("pUSHED "+val);
    }
    void pop(){
        if(start==null){
            System.out.println("Now wat");
        }else{
            System.out.println(start.val+"pop");
            start=start.next;
        }
    }
    public static void main(String[] args) {
        QueueLL Q=new QueueLL();
        Q.push(2);
        Q.pop();
        Q.pop();
    }
}
