package arrays;
import java.util.*;
public class Count_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums.length - n - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        int unique=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                unique++;
            }
        }
        System.out.println(unique);
    }
}
