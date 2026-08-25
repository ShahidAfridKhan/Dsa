package OldSet.OOPS.Stack;
import java.util.*;
public class BasicsStack {
    public static void main(String[] args) {
        //int nums[]=new int[n]; creation of array
        // OldSet.OOPS.ArrayList<Integer> arr=new OldSet.OOPS.ArrayList<>(); creation of the OldSet.OOPS.ArrayList
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());


    }
}
