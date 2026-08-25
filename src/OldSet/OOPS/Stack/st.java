package OldSet.OOPS.Stack;

public class st {
    int size=2;
    int stack[]=new int[size];
    int top=-1;

    void push(int val){
        if(top==size-1){
            System.out.println("No space bosss");
        }else{
            stack[++top]=val;
            System.out.println("pushed "+val);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("No ele");
        }else{
            System.out.println(stack[top--]+"pop");
        }
    }

    public static void main(String[] args) {
        st sta=new st();
        sta.push(3);
        sta.push(4);
        sta.push(5);
        sta.pop();
        sta.pop();
        sta.pop();

    }
}
