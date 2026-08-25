package OldSet.OOPS.SlidingWindow;

public class ProductLessK {
    public static int Less(int nums[],int k){
        int start=0;
        int end=0,count=0;
        int n=nums.length-1;
        int pro=1;
        while(end<=n){
            pro*=nums[end];

            if(pro<k){
                count++;
            }
            if(pro>=k || end==n){
                end=start-1;
                start++;
                pro=1;
            }
            end++;
        }
        return count;
    }
    public static void main(String[] args) {

        int nums[]={10, 5, 2, 6};
        System.out.println(Less(nums,100));
    }
}
