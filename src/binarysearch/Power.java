package binarysearch;

public class Power {
    public static int returnpower(int nums[],int mid){
        int count=1,sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                count++;

                double pos=sum/mid;
                int result=(int) pos;
                sum=0;
                sum+=result;
            }
        }
        return count;
    }
    public static int retunans(int nums[],int D){
        int low=0;
        int high=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]>high) high=nums[i];
            //if(nums[i]<low) low=nums[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int res=returnpower(nums,mid);

            if(res<=D){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {

        int nums[]={1, 3, 5, 7, 9};

        System.out.println(retunans(nums,2));
    }
}
