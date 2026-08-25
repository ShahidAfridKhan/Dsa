package OldSet.OOPS.slidingwindowK;

public class Factor {
    public static int duefactor(int nums[],int k){
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];

            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={2, 5, 1, 8, 3, 6, 4};

        System.out.println(duefactor(nums,3));
    }
}
