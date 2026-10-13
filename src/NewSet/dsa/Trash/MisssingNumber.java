package NewSet.dsa.Trash;

public class MisssingNumber {
    public static void main(String[] args) {
        int  nums[]={1,2,3,4,6};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length+1;

        int missing=n*(n+1)/2;
        System.out.println(missing-sum);

    }
}
