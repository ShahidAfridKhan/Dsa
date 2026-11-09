package NewSet.dsa.OOPS;

public class Pb1 {
    private double balance=5000;

    public double getbalance(){
        return balance;
    }
    public double setbalance(double amount){
        return balance+=amount;
    }


    public static void main(String[] args) {
        Pb1 p=new Pb1();

        System.out.println(p.setbalance(5000));
    }
}
