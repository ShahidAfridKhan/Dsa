package CoreArrays;
import java.util.*;
public class Printing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        //your code



        for(int ans:nums){
            System.out.print(ans+" ");
        }
    }
}
