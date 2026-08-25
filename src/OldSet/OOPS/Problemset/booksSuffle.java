package OldSet.OOPS.Problemset;

public class booksSuffle {

    public static int suff(int nums[]){
        int l=0;
        int Minsum=Integer.MAX_VALUE;
        int sum=0;
        while(l<nums.length-1){
            sum=nums[l]+nums[l+1];
            Minsum=Math.min(sum,Minsum);
            sum=0;
            l++;
        }
        return Minsum;
    }
    public static void main(String[] args) {
        int nums[]={25,46,28,49,24};

        System.out.println(suff(nums));
    }
}
