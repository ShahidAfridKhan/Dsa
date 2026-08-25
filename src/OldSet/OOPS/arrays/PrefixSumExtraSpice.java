/*
package OldSet.OOPS.arrays;

public class PrefixSumExtraSpice {
    public static void main(OldSet.OOPS.String[] args) {
        int nums[] = {1, 7, 3, 6, 5,7,8};
       /*
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }


        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        //System.out.println(mid);
        int sum=0;
        for(int i=0;i<=mid;i++){
            sum+=nums[i];
        }
      //  System.out.println(sum);
        int sum1=0;
        int val=mid+1;
        for(int i=val;i<nums.length;i++){
            sum1+=nums[i];
        }
      //  System.out.println(sum1);

        if(sum==sum1){
            System.out.println("true bro");
        }else{
            System.out.println("yandhi bosssu");
        }



    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=total-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}


 */