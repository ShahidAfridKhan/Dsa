package OldSet.OOPS.Stack;

public class Implementation {
    int max=5;
    int stack[]=new int[max];

    int top=-1;

    void push(int val){
        if(top==max-1){
            System.out.println("No extra Space");
        }else{
            stack[++top]=val;
            System.out.println(val+ "pushed");
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("No ele found");
        }else{
            System.out.println(stack[top--]+" popp");
        }
    }

    public static void main(String[] args) {
        Implementation st = new Implementation();
        st.push(3);
    }
}
