package Problemset;
import java.util.*;
public class ReverseNumber {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int ans=n%10;

            rev=rev*10+ans;

            n=n/10;

        }
        return rev;
    }
    public static String reversee(int n){
        int rev=0;
        int original=n;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;

            n=n/10;
        }
        if(original==rev){
            return "Palindrom bro";
        }
        return "NA";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       // System.out.println(reverse(n));
        System.out.println(reversee(n));
    }
}
