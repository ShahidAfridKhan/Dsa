package OldSet.OOPS.arrays;

public class SubArray {
    class Solution {
        public static int findSecondHighest(int[] arr) {

            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            // ======= FILL YOUR LOGIC HERE =======




            // ====================================

            if (secondHighest == Integer.MIN_VALUE) {
                return -1;
            }

            return secondHighest;
        }

        public static void main(String[] args) {
            int[] visitors = {120, 450, 300, 450, 200};
            System.out.println(findSecondHighest(visitors));
        }
    }

}
