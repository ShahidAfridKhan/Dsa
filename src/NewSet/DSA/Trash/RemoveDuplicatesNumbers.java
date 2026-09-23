package NewSet.DSA.Trash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicatesNumbers {
    public static void main(String[] args) {
        int nums[]={1,2,34,4,53,3,3,2,4,5,23,34};

        TreeSet<Integer> set=new TreeSet<>();


        for(int ans:nums){
            set.add(ans);
        }
        System.out.println(set);
/*
        int t=0;
        int ans[]=new int[set.size()];
        for(int res:set){
            ans[t]=res;
            t++;
        }
       // Arrays.sort(ans);

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length-i-1;j++){
                if(ans[j]>ans[j+1]){
                    int temp=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ans));


 */
    }
}
