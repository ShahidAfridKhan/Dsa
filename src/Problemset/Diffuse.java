package Problemset;
import java.util.*;
public class Diffuse {
    public static void main(String[] args) {
        int nums[]={5,7,1,4};
        int k=1;
        int ans[]=new int[nums.length];
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            totalsum-=nums[i];
            ans[i]=totalsum;
            totalsum+=nums[i];
        }
        for(int finall:ans){
            System.out.print(finall+" ");
        }
    }
}
