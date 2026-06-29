package Problemset;

public class oddsuba {
    public static int countt(int nums[],int k){
        int l=0,r=0,count=0;
        int sub=k;
        while(r<nums.length){
            if(nums[r]%2!=0){
                k--;
            }
            if(k==0){
                count++;
                l++;
                r=l-1;
                k=sub;
            }
            r++;
        }
        return count;
    }

    public static void main(String[] args) {

        int nums[]={2,4,6};

        System.out.println(countt(nums,1));

    }
}
