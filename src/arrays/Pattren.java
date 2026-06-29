package arrays;
import java.util.*;
public class Pattren {
    public static void Pattren1(int n) {
        /*
        Eg:3
        *
        * *
        * * *
         */
        System.out.println("Pattren 1 is: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattren2(int n) {
        /*
        Eg:4
        1
        2 2
        3 3 3
        4 4 4 4
         */
        System.out.println("Pattren 2 is: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void Pattren3(int n) {
        /*
        Eg:4
        a
        b c
        d e f
        g h i j
         */
        System.out.println("Pattren 3 is: ");

        char ch = 'a';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void Pattren4(int n) {
        /*
        Eg:4
        * # # #
        * * # #
        * * * #
        * * * *

         */
        System.out.println("Your 4th Pattren is");
     for(int i = 1; i<=n;i++) {
        for (int j = 1; j <= n; j++) {
            if (j <= i) {
                System.out.print("* ");
            } else {
                System.out.print("# ");
            }
        }
        System.out.println();

     }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Pattren1(n);
        //Pattren2(n);
        //Pattren3(n);
        Pattren4(n);
    }
}
