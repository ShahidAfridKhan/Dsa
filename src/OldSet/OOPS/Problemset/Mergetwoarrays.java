package OldSet.OOPS.Problemset;
import java.util.*;

public class Mergetwoarrays {

    public static int[] numss() {

        int nums1[] = {1, 2, 3, 5, 67};
        int nums2[] = {23, 67, 44, 55, 7};

        int ans[] = new int[nums1.length + nums2.length];

        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            ans[k++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            ans[k++] = nums2[i];
        }

        Arrays.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        int result[] = numss();

        System.out.println(Arrays.toString(result));
    }
}