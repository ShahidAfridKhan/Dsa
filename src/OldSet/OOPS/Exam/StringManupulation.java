package OldSet.OOPS.Exam;
import java.util.*;
public class StringManupulation {
    public static void manipulateString(int n,String str){
        for(int i=0;i<n;i++){
            System.out.print(str.toUpperCase());
        }
        System.out.println();
        System.out.println("Length");
        System.out.print(n*str.length());

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Integer");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("String");
        String str=sc.nextLine();
        manipulateString(n,str);
    }
}
