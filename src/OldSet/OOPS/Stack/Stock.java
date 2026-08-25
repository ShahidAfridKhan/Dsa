package OldSet.OOPS.Stack;
import java.util.*;
public class Stock {
    public static int[] Stock(int nums[]){
        Stack<Integer> stack=new Stack<>();

        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }if(stack.isEmpty()){
                ans[i]=-1;
            }else{
               if(stack.peek() > nums[i]){
                    ans[i]=stack.peek();
               }
            }
            stack.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={100, 80, 60, 70, 60, 75, 85};
             //    [-1, 100, 80, 80, 70, 80, 100]
        int result[]=Stock(nums);

        System.out.println(Arrays.toString(result));
    }
}
