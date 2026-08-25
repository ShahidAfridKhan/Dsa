/*
package OldSet.OOPS.arrays;
import java.util.*;
public class SquareOfArray {
    public static int[] Twosum(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;i++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    public static int MoveZeroes(int nums[]) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
    }
    public static void squares(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(OldSet.OOPS.String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Twosum(nums,target));
    }

 */

