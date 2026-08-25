package OldSet.OOPS.slidingwindowK;

public class Kmax {
    public static int kth(int nums[],int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=0;
        max=sum;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[]={2, 4, 1, 7, 3, 5};
        int k=3;
        System.out.println(kth(nums,k));
    }
}
