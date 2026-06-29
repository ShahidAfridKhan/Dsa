package Stack;

import java.util.Stack;

public class MaxUptoK {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int nums[]={3,1,-1};
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && st.peek()<nums[i]){
                st.pop();
            }
            if(nums[i]>st.peek()){
                st.push(nums[i]);
            }
            st.push(nums[i]);
        }
        System.out.println(st.peek());
    }
}
