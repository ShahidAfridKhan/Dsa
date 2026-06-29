package Problemset;

public class Conversation {
    int max=2;
    int stack[]=new int[max];
    int top=-1;
    void push(int val){
        if(top==max-1){
            System.out.println("there is no extra space");
        }else{
            stack[++top]=val;
            System.out.println("Pushed "+val);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("we cant do it");
        }else{
            System.out.println(stack[top--]+" pop");
        }
    }

    public static void main(String[] args) {
        Conversation st=new Conversation();

        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.pop();
        st.pop();
    }
}
