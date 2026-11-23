package NewSet.dsa.miniprojects.bankaccount;

import java.time.LocalDate;
import java.util.*;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private LocalDate creationDate;


    public BankAccount(String accountNumber, String accountHolderName, String accountType, double balance) {
        validateInput(accountNumber, accountHolderName, accountType, balance);

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.creationDate = LocalDate.now();
    }

    public void validateInput(String accountNumber, String accountHolderName, String accountType, double balance) {

        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("No account Numebr");
        }
        if (accountHolderName == null || accountHolderName.isEmpty()) {
            throw new IllegalArgumentException("No Account Holder Name");
        }
        if (accountType == null || (!accountType.toUpperCase().equals("SAVINGS") && !accountType.toUpperCase().equals("CHECKING"))) {
            throw new IllegalArgumentException("IT should savings ot Checking");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Initial Balace cannot be negative");
        }
    }

    public void deposite(double amount) {
        if (amount <= 0) {throw new IllegalArgumentException("balance should min");}
            balance += amount;
        System.out.println("total balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("balance should min");

        System.out.println("total balance: " + balance);
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Current balance: " + balance + ", requested: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public String accountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void displayContent() {
        System.out.print("AccountNumber: " + accountNumber + " | ");
        System.out.print("AccountHolderName: " + accountHolderName + " | ");
        System.out.print("AccountType: " + accountType + " | ");
        System.out.println("balance: " + balance);
    }
}
    class clling{
        public static void main(String[] args) {
            BankAccount a1 = new BankAccount("SBI123", "Shahid", "savings", 20000);
            BankAccount a2 = new BankAccount("SBI124", "Rahul", "checking", 15000);
            BankAccount a3 = new BankAccount("SBI125", "Priya", "savings", 30000);
            BankAccount a4 = new BankAccount("SBI126", "Amit", "checking", 25000);
            BankAccount a5 = new BankAccount("SBI127", "Sneha", "savings", 10000);
            BankAccount a6 = new BankAccount("SBI128", "Vijay", "checking", 18000);
            BankAccount a7 = new BankAccount("SBI129", "Ananya", "savings", 35000);
            BankAccount a8 = new BankAccount("SBI130", "Rohit", "checking", 12000);
            BankAccount a9 = new BankAccount("SBI131", "Meera", "savings", 22000);
            BankAccount a10 = new BankAccount("SBI132", "Kumar", "checking", 28000);

            // Create the list with all 10 objects
            List<BankAccount> list = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
            a1.deposite(100000);
            a1.withdraw(5000000);

            for(BankAccount b:list){
                b.displayContent();
            }

        }
    }


