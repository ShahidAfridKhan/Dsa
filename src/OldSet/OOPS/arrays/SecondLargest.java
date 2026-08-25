package OldSet.OOPS.arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int nums[] = {-1, -1, -1, -3, -3, -6};
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        System.out.println(secondLargest);
    }
}
