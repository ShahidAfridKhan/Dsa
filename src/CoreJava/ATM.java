package CoreJava;
import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        int withdraw=sc.nextInt();

        if(withdraw<balance){
            balance=balance-withdraw;

            System.out.println("Yout with dwaw amount"+withdraw);
            System.out.println("Avalibalance"+balance);
        }else{
            System.out.println("No Much balance your current balance is "+ balance);
        }
    }
}
