package Problemset;
import java.util.*;
public class Continus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,1,1,1,5};

        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]*nums[i];
        }
        System.out.println();

    }
}
