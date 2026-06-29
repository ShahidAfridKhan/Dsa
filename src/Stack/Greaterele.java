package Stack;
import java.util.*;
public class Greaterele {

    public static int retur(int nums[]){
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(nums[i]);
            }else{
                if(nums[i]>st.peek()){
                    st.push(nums[i]);
                }
            }
        }
        return st.peek();

    }
    public static void main(String[] args) {
        int nums[]={1,5,2,9,10,9};

        System.out.println(retur(nums));
    }
}
