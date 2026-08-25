package OldSet.OOPS.String;

import java.util.*;
class occurrrent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=nums.length-1;
        int ind=-1;
        int ind1=-1;
        while(left<=right){
            if(nums[left]==target && ind==-1){
                ind=left;
            }else if(nums[right]==target && ind1==-1){
                ind1=right;
            }
            left++;
            right--;
        }
        if(ind==-1 && ind1==-1){
            System.out.println("not found beta");
        }
        System.out.println("fist"+ind+"sec"+ind1);
    }
}
