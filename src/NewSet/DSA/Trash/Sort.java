package NewSet.DSA.Trash;

public class Sort {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,45,65,0,34,88};

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int ans:nums){
            System.out.print(ans+" ");
        }
    }
}
