package OldSet.OOPS.Stack;
import java.util.*;
public class reverseStack {

    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);

        while(!st1.isEmpty()){
            st2.push(st1.peek());
            st1.pop();
        }
        System.out.println(st2);

    }
}
