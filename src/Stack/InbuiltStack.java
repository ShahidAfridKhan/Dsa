package Stack;
import java.util.Stack;
public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);


        int i=0;
        int sum=0;
        while(!st.isEmpty()){
            System.out.println("in intreation "+"popped "+st.pop());
        }

        System.out.println(st);
    }
}
