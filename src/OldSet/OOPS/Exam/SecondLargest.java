package OldSet.OOPS.Exam;
import java.util.*;
public class SecondLargest {
    public static int findSecondLargest(int nums[]) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i=0; i<nums.length;i++) {
            int current = nums[i];

            if (current>largest) {
                secondLargest=largest;
                largest= current;
            }
            else if (current>secondLargest && current!=largest) {
                secondLargest=current;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("elements");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        findSecondLargest(nums);
    }
}
