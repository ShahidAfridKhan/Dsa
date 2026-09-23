package NewSet.DSA.Trash;

public class MinMax {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int n=nums[0];
        int max=0,min=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n){
                max=nums[i];
            }else{
                min=nums[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
