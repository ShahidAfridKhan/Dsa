package Problemset;

public class Sum2 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};


        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondlargest=largest;
                largest=nums[i];
            }else if(nums[i]>secondlargest && nums[i]!=largest){
                secondlargest=nums[i];
            }
        }
        System.out.println(secondlargest);
    }
}
