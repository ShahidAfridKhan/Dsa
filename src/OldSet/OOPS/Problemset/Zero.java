package OldSet.OOPS.Problemset;

public class Zero {

    public static void returnn(int nums[]){
        int right=0;

        while(right<nums.length-1){
            if(nums[right]==0){
                int temp=nums[right];
                nums[right]=nums[right+1];
                nums[right+1]=temp;
            }
            right++;
        }
    }
    public static void main(String[] args) {
        int nums[]={4,5,0,1,9,0,5,0};
        returnn(nums);
        //System.out.println(returnn(nums));
    }
}
