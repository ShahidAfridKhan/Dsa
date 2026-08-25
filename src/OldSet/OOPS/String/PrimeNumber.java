package OldSet.OOPS.String;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me you number");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }

            if (i == num) {
                System.out.println(num);
            }
        }
    }
}
