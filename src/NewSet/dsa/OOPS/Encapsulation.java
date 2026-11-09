package NewSet.dsa.OOPS;

public class Encapsulation {

    private int balance = 5000;

    public int getbalance() {
        return balance;
    }

    public int setbalance(int amount) {
        balance += amount;

        return balance;
    }

    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();

        System.out.println(e.setbalance(4000));
    }
}
