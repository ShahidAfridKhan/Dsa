/*
package SlidingWindow;

public class onescons1004 {
    public static int cn(int nums[],int k){
        int l=0,r=0,zero=0,len=0,maxlen=0;

        while(r<nums.length){
            if(nums[l]==0) zero++;

            if(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k){
                len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        return maxlen;
    }


    public static void main(String[] args) {

    }
}


 */
