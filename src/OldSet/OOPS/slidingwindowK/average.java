package OldSet.OOPS.slidingwindowK;

import java.util.Arrays;

public class average {

    public static int[] name(int nums[],int k){
        int avg[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count<k){
                avg[i]=-1;
            }else{
                int sum=0;
               for(int j=0;j<k*2+1;j++){
                   sum+=nums[i];
                   int x=k*2+1;
                   int p=sum/x;
                   avg[i]=p;
               }
            }
            count++;
        }

        return avg;
    }

    public static void main(String[] args) {
        int nums[]={1,2, 3, 4,9,9,9,9};

        System.out.print(Arrays.toString(name(nums,3)));
    }
}
