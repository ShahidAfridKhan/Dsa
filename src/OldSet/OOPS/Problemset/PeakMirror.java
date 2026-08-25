package OldSet.OOPS.Problemset;

public class PeakMirror {
    public static int Mirror(int nums[]){
        int sum=0;
        int postsum=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];

            if(nums[i]>postsum && nums[i]<sum){
                return nums[i];
            }
            postsum+=nums[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,7,9};
        System.out.println(Mirror(nums));
    }
}
