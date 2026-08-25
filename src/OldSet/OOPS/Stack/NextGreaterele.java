package OldSet.OOPS.Stack;
import java.util.*;
public class NextGreaterele {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        int nums[]={4, 2, 5, 3, 7};


        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && st.peek()<nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }

        System.out.println(st);
    }
}
