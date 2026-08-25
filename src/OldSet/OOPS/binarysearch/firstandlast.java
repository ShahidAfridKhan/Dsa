//import java.util.*;
//class Main{
//    public static int firstocc(int nums[],int target) {
//        int low = 0;
//        int high = nums.length - 1;
//        int ans=-1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//           // int ans = -1;
//            if (nums[mid] == target) {
//                ans = mid;
//                high = mid - 1;
//            } else if (nums[mid] < target) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return ans;
//    }
//    public static int lastocc(int nums[],int target){
//        int low=0;
//        int high=nums.length-1;
//        int ans1=-1;
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if(nums[mid]==target){
//                ans1=mid;
//                low=mid+1;
//            }else if(nums[mid]<target){
//                low=mid+1;
//            }else{
//                high=mid-1;
//            }
//        }
//        return ans1;
//    }
//    public static void main(OldSet.OOPS.String args[]){
//        Scanner sc=new Scanner(System.in);
//
//        int n=sc.nextInt();
//        int nums[]=new int[n];
//
//        for(int i=0;i<nums.length;i++){
//            nums[i]=sc.nextInt();
//        }
//
//        int target=sc.nextInt();
//
//        int result1=firstocc(nums,target);
//        int result2=lastocc(nums,target);
//
//        System.out.println("fist"+result1+" "+"second"+result2);
//    }
//}
import java.util.*;

class Main {
    public static int fis(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1; // move left to find first occurrence
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int sec(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans1 = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans1 = mid;
                start = mid + 1; // move right to find last occurrence
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int res1 = fis(nums, target);
        int res2 = sec(nums, target);

        System.out.println(res1 + " " + res2);
    }
}
