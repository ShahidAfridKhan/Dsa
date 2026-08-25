package OldSet.OOPS.Problemset;

public class Basha1 {
    public static int continuee(int nums[]){
        int count=1;
        int maxcount=1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=1;
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int nums[]={1,3,5,4,7};

        System.out.println(continuee(nums));
    }
}
