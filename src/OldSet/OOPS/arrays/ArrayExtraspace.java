package OldSet.OOPS.arrays;
import java.util.*;
public class ArrayExtraspace {
    public static void even(int nums[],int prefer){
        int even[]=new int[nums.length];
        int odd[]=new int[nums.length];
        int evensize=0;
        int oddsize=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[evensize]=nums[i];
                evensize++;
            }
            else{
                odd[oddsize]=nums[i];
                oddsize++;
            }
        }
        if(prefer==2){
            for(int i=0;i<evensize;i++){
                System.out.print(even[i]+" ");
            }
        }else if(prefer == 1){
            for(int i=0;i<oddsize;i++){
                System.out.print(odd[i]+" ");
            }
        }else{
            System.out.println("only 1 or 2 prefer");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int prefer=sc.nextInt();
        even(nums,prefer);
    }
}
