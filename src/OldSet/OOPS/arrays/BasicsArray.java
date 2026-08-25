package OldSet.OOPS.arrays;
import java.util.*;
public class BasicsArray {
    public static boolean Binarysearch(int nums[],int target){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=end+(start-end)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        /*
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        for(int ans:nums){
            System.out.print(ans+" ");
        }


        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int Expet=n*(n+1)/2-sum;
        System.out.println(Expet);


         */
        //Binary Search

        int target=sc.nextInt();
        System.out.println(Binarysearch(nums,target));

    }
}
