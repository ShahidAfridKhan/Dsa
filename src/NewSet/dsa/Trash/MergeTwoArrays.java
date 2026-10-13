package NewSet.dsa.Trash;
import java.util.*;
public class MergeTwoArrays {
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5};
        int nums2[]={6,7,8,9,10};

        int ans[]=new int[nums1.length+nums2.length];

       for(int i=0;i<nums1.length;i++){
           ans[i]=nums1[i];
       }
        int k=nums1.length+1;
        for(int j=0;j<nums2.length;j++){
           ans[nums1.length+j]=nums2[j];

       }
        System.out.println(Arrays.toString(ans));
    }
}
