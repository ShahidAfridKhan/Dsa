package OldSet.OOPS.Problemset;
import java.util.*;

public class AggressiveCow {

    public static boolean countvalid(int nums[], int valid, int countcows) {
        int lastcow = nums[0];
        int cntcow = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - lastcow >= valid) {
                cntcow++;
                lastcow = nums[i];
            }
        }

        return cntcow >= countcows;
    }

    public static int returntype(int nums[], int cows) {
        Arrays.sort(nums);

        int low = 1;
        int high = nums[nums.length - 1] - nums[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean result = countvalid(nums, mid, cows);

            if (result) {
                low = mid + 1;      // try larger distance
            } else {
                high = mid - 1;     // reduce distance
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 8, 9};

        System.out.println(returntype(nums, 3));
    }
}