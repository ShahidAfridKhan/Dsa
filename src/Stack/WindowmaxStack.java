package Stack;
import java.util.*;
public class WindowmaxStack {
    public static int[] bond(int nums[],int k){
        int sum=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            max=Math.max(max,sum);

            st.push(max);
        }

        int ans[]=new int[st.size()];

        int i=ans.length-1;

        while(!st.isEmpty()){
            ans[i--]=st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1, 3, -1, -3, 5, 3, 6, 7};

        int k=3;

        System.out.println(Arrays.toString(bond(nums,k)));
    }
}
