package SlidingWindow;

import java.util.Arrays;

public class sumTotargetGG {
    public static int[] ret(int nums[],int target){
        int start=0;
        int end=0,sum=0;
        while(end<nums.length){
            sum+=nums[end];

            while(sum>target){
                sum=sum-nums[start];
                start++;
            }
            if(sum==target){
                return new int[]{start+1,end+1};
            }
            end++;
        }
        return new int[]{-1};
    }



    public static void main(String[] args) {
       // int nums[]={1,2,3,7,5};
      //  int nums[]={1,2,3,4,5,6,7,8,9,10};
        int nums[]={5,3,4};

        System.out.println(Arrays.toString(ret(nums,2)));

    }
}
