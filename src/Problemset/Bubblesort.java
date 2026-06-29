package Problemset;

public class Bubblesort {
    public static void sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={3,1,5,4,3,6};
        sort(nums);

        for(int ans:nums){
            System.out.print(ans +" ");
        }
    }
}
