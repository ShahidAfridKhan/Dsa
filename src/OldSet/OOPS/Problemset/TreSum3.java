package OldSet.OOPS.Problemset;

public class TreSum3 {
    public static int returnn(int nums[]) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int maxIndex = -1;

        // Find max, secMax, and index of max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secMax = max;
                max = nums[i];
                maxIndex = i;   // store index
            } else if (nums[i] > secMax && nums[i] != max) {
                secMax = nums[i];
            }
        }

        // Traverse till max index
        int sum = 0;
        for (int i = 0; i <= maxIndex; i++) {
            sum += nums[i];
        }

        // subtract second max once (if needed)
        sum = sum - secMax;

        return sum;
    }

    public static void main(String[] args) {

        int nums[]={ 1,8,6,2,5,4,8,3,7};
        System.out.println(returnn(nums));

    }
}
