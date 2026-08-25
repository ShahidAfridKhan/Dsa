package OldSet.OOPS.Problemset;

public class BinarySubarray {
    public static int countsrr(int nums[],int goal){
        int l=0;
        int r=0,sum=0,count=0;

        while(r<nums.length){
            sum+=nums[r];

            if(sum==goal){
                count++;

                sum=sum-nums[l];
                l++;
            }
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,0,1,0,1};

        System.out.println(countsrr(nums,2));

    }
}
