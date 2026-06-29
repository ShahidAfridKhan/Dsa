package OOPS.classandobjects;
import java.util.*;

class Bank{
    String name;
    long accnu;
    double balance;
    HashSet<Long> accounts=new HashSet<>();
    Bank(String name,long accnu,double balance){
        this.name=name;
        this.accnu=accnu;
        this.balance=balance;

        accounts.add(accnu);
    }

    void login(long accountnumber){
        if(accounts.contains(accountnumber)){
            System.out.println("Login success....");
        }else{
            System.out.println("enter your number");
        }
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("accnu: "+accnu);
        System.out.println("balance: "+balance);
        System.out.println();

    }
    public void deposite(double amount1){
        balance+=amount1;
        System.out.println("Okay done deposite: "+amount1);
        System.out.println("current balance: "+balance);
    }
    public void withdraw(double amount1){
        balance-=amount1;
        if(balance > amount1){
            balance-=amount1;
            System.out.println(amount1 +"sucess....");
            System.out.println("current balance: "+balance);
        }else {System.out.println("no balance bro.....");
        System.out.println();};
    }
    void checkbalance(){
        System.out.println();

        System.out.println("balance: ......"+balance);
    }
}

public class BankingP {
    public static void main(String[] args) {

        Bank b1=new Bank("Shaihd",14999999,40000);
        Bank b2=new Bank("Khan",1234567,6000);

        b1.login(14999999L);
        b1.login(12345678);
    }
}
