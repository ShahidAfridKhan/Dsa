package arrays;

public class LinearSearchvsbinarySearch {

    public static boolean Linearsearch(int nums[],int target){
       for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
               return true;
           }
       }
        return false;
    }
    public static int BinarySearch(int nums1[],int target){
        int left=0;
        int right=nums1.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums1[mid]==target){
                return mid;
            }else if(nums1[mid]>target){
                right=mid+1;
            }else{
                left=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,4,6,3,7};
        int nums1[]={6,5,4,3,2,1};
        int target=6;
       System.out.println(Linearsearch(nums,target));
       // System.out.println();
        System.out.println(BinarySearch(nums,target));
    }
}
