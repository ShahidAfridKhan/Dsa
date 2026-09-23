package NewSet.DSA.Trash;

public class SecondLargest {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,87,89};
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
