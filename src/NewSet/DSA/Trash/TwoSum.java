package NewSet.DSA.Trash;

import java.util.Arrays;

public class TwoSum {
    public static int[] r(int t,int mu[]){
        for(int i=0;i<mu.length;i++){
            for(int j=i+1;j<mu.length;j++){
                if(mu[i]+mu[j]==t){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(TwoSum.r(3,nums)));

    }
}
