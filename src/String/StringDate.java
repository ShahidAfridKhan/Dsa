package String;
import java.util.*;
public class StringDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give your date in this format(dd.mm.yyyy)");
        String str=sc.nextLine();
        String divide[]=str.split(".");

        int day=Integer.valueOf(divide[0]);
        int month=Integer.valueOf(divide[1]);
        int year=Integer.valueOf(divide[2]);

        if(year%400==0 || year%4==0){
            System.out.println("Your date is LeapYear");
        }else{
            System.out.println("Not an LeapYear");
        }

    }

}
