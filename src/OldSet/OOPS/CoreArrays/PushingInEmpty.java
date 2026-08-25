package OldSet.OOPS.CoreArrays;
import java.util.*;
public class PushingInEmpty {
    public static void even(int nums[]) {
        int even[] = new int[nums.length];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[size] = nums[i];
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(even[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        //your code

        even(nums);
    }
}