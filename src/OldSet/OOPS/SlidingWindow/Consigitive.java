package OldSet.OOPS.SlidingWindow;

public class Consigitive {
    public static int max(int[] nums) {
        int k = 2;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {
            int zero = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zero++;
                }
                if (zero <= k) {
                    int len = j - i + 1;
                    maxlen = Math.max(maxlen, len);
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {

        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        System.out.print(max(nums));

    }
}
