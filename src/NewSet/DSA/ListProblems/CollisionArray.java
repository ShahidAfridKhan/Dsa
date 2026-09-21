package NewSet.DSA.ListProblems;

import java.util.HashSet;

public class CollisionArray {
    static int[] Coll(int nums1[],int nums2[]){
        int left=0;
        int right=0;
        HashSet<Integer> set=new HashSet<>();
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]!=nums2[right]){
                if(nums1.length>nums2.length){
                    left++;
                }else{
                    right++;
                }
            }else{
                set.add(nums2[right]);
            }
        }
        int ans[]=new int[set.size()];
        int k=0;
        for(int result:set){
            ans[k]=result;
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};

        System.out.println(Coll(nums1,nums2));
    }
}
