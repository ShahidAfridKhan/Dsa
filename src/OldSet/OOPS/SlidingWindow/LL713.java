package OldSet.OOPS.SlidingWindow;

public class LL713 {
    public static int mulsubarray(int nums[],int k){
        int l=0,r=0,count=0;
        int mul=1;
        while(r<nums.length){
            mul*=nums[r];
            if(mul<k){
                count++;
            }
            if(r==nums.length-1){
                l++;
                r=l-1;
                mul=1;
            }
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={10,5,2,6};

        System.out.println(mulsubarray(nums,100));
    }

}
