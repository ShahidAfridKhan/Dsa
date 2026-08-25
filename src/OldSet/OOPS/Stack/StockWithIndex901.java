package OldSet.OOPS.Stack;
import java.util.*;

public class StockWithIndex901 {
    public static int[] Calling(int nums[]){
        int ans[]=new int[nums.length];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }if(stack.isEmpty()){
                ans[i]=1;
            }else{
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {

        int nums[]={100, 80, 60, 70, 60, 75, 85};
        //    [1, 1, 1, 2, 1, 4, 6]
        int result[]=Calling(nums);

        System.out.println(Arrays.toString(result));
    }
}
