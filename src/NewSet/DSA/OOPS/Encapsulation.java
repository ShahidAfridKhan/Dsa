package NewSet.DSA.OOPS;

public class Encapsulation {

    private double balance;

    public void deposite(double amount){
        balance+=amount;
    }

    public double getbalance(){
        return balance;
    }


    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();

        e.deposite(50000);
        e.deposite(90000);

        System.out.println(e.getbalance());
    }
}
