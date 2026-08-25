package OldSet.OOPS.Problemset;

import java.util.Arrays;
import java.util.Stack;

public class StackPractice {
    public static int []nextgreater(int nums[]){
        int result[]=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) {

        int nums[]={2,1,2,4,3};
        System.out.println(Arrays.toString(nextgreater(nums)));
    }
}
