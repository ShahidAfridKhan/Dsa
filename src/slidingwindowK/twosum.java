package slidingwindowK;
import java.util.*;
public class twosum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            for(int i=0;i<nums.length;i++){
                if(nums[i]+nums[i+1]==target){
                    System.out.println("yes");
                }
            }
            for(int ans:nums){
                System.out.println(ans);
            }
        }
}
