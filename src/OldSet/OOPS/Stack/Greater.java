package OldSet.OOPS.Stack;
import java.util.*;
public class Greater {
    public static int[] ret(int nums[]){
        Stack <Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]>st.peek()){
                st.pop();
            }
            st.push(nums[i]);
        }
        int ans[]=new int[st.size()];
        int i=ans.length-1;
        while(!st.isEmpty()){
            ans[i--]=st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={4,3,7,2,5,1};

        System.out.println(Arrays.toString(ret(nums)));

    }
}
