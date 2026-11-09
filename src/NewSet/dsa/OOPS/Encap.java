package NewSet.dsa.OOPS;

public class Encap {
    private double balance=10000;

    public double getbalance(){
        return balance;
    }
    public double setbalance(double amount){
        return balance+=amount;
    }

    public static void main(String[] args) {
        Encap e=new Encap();
        System.out.println(e.getbalance());
        System.out.println(e.setbalance(6000));
    }
}
