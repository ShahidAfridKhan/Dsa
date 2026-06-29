package Problemset;

public class P410 {
    public static int splitArray(int[] nums, int k) {
        int low = 0;
        int sum = 0;
        int count = 0;
        int high = nums.length;
        int q = nums.length / k;
        int max = 0;

        while (low < high) {
            sum += nums[low];
            count++;
            low++;

            if (count == q) {
                max = Math.max(max, sum);
                sum = 0;
                count = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int nums[]={7,2,5,10,8};
        int k=2;

        System.out.println(splitArray(nums,k));
    }
}
