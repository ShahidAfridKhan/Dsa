package OldSet.OOPS.Problemset;
import java.util.*;

public class StabilityScoreofanArray {
    public static int Stability(int nums[]){
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]<nums[i+1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();
        int nums[]={2, 5, 7, 9, 12};

//        for(int i=0;i<nums.length;i++){
//            nums[i]=sc.nextInt();
//        }

        System.out.print(Stability(nums));
    }
}
