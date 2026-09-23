package NewSet.DSA.Trash;

public class BinarySearch {
    static boolean searching(int n,int nums[]){
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==n){
                return true;
            }
            if(nums[mid]>n){
                right=mid-1;
            }else{
                left=mid+1;
            }
            }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,17};
        System.out.println(BinarySearch.searching(100,nums));
    }
}
