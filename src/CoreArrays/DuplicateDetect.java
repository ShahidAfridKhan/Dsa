package CoreArrays;
import java.util.*;
public class DuplicateDetect {
    public static boolean detect(int nums[],int k){
        int a=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a=nums[i]-nums[j];
                }
            }
            if(a<=k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int k=2;
        System.out.println(detect(nums,k));
    }
}
