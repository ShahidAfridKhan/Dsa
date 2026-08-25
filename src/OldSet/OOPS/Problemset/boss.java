package OldSet.OOPS.Problemset;
import java.util.*;
public class boss {
    public static String oss(int n){
        while(n>1){
            n=n-2;
        }
        if(n==0){
            return "even";
        }else{
            return "odd";
        }
    }
    static void print(int n){
        while(n>1){
            System.out.print(n+" ");
            n--;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boss b=new boss();
        System.out.println(b.oss(n));
        print(n);
    }
}

