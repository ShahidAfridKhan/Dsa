package OldSet.OOPS.Problemset;

public class Center {

    public static int center(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int rightsum=0;

        for(int i=0;i<nums.length;i++){
            sum-=nums[i];

            if(nums[i]<rightsum && nums[i]>sum){
                return 0;
            }

            rightsum+=nums[i];

        }
        return 1;
    }
    public static void main(String[] args) {


        //int nums[]={2,1,6,1,2};
        int nums[]={1, 3, 2, 3, 1};
        System.out.println(center(nums));

    }
}
