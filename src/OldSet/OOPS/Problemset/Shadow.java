package OldSet.OOPS.Problemset;

public class Shadow {
    public static int Shadoww(int  nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int count=0;
        for(int i=0;i<1;i++){
            int playback=0;

            sum-=nums[i];
            int total=playback-sum;

            int abs=Math.abs(total);

            if(abs<=nums[i]){
                count++;
            }
        }
        int postsum=0;
        for(int i=1;i<nums.length;i++){
            sum-=nums[i];
            postsum+=nums[i-1];

            int totalsum=postsum-sum;

            int absu=Math.abs(totalsum);

            if(absu<=nums[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //int nums[]={3,1,2,4,2};
        int nums[]={5,5,5};

        System.out.println(Shadoww(nums));
    }
}
