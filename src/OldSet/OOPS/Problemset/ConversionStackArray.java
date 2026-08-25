package OldSet.OOPS.Problemset;


public class ConversionStackArray {

    int max=4;
    int stack[]=new int[max];
    int top=-1;
    void push(int value){
        if(top==max-1){
            System.out.println("no extra space");
        }else{
            stack[++top]=value;
            System.out.println("pushed "+value);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("No element");
        }else{
            System.out.println(stack[top--]+ " removed");
        }
    }

    public static void main(String[] args) {
        ConversionStackArray st=new ConversionStackArray();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();

    }
}
