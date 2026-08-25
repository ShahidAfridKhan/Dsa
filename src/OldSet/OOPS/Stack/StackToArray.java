package OldSet.OOPS.Stack;
import java.util.*;
public class StackToArray {
    int max=5;
    int stack[]=new int[max];
    int temp=-1;
    
    void push(int value) {
        if(temp==max-1){
            System.out.println("boss sorry no extra space");
        }else{
            stack[++temp]=value;
            System.out.println("Pushed");
        }
    }
    void pop() {
        if (temp == -1) {
            System.out.println("sTACK NO SPCAE");
        } else {
            System.out.println(stack[temp--] + "Pop");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        StackToArray st=new StackToArray();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.pop();
        st.pop();
        //System.out.println(stack[temp]);
    }
}
