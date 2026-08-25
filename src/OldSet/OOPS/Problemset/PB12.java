package OldSet.OOPS.Problemset;
import java.util.*;
public class PB12 {
    public static void main(String[] args) {


        int nums[]={3,9,2,1,7};
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int k=3;
        for(int right=0;right<nums.length;right++){
            if(right-left==k){
                HashSet<Integer> set=new HashSet<>();
                for(int i=left;i<=right;i++){
                    set.add(nums[i]);
                }

                for(int ans:set){
                    map.put(ans,map.getOrDefault(ans,0)+1);
                }
                left++;
            }
        }

        int ans=-1;

        for(int num: map.keySet()){
            if(map.get(num)==1){
                ans=Math.max(ans,num);
            }
        }
        System.out.println(ans);
    }
}
