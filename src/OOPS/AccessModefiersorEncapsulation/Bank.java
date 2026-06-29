package OOPS.AccessModefiersorEncapsulation;
//get and set
class Accounts{
    public String name;
    private int accountnum;

    public int getaccount(){
        return accountnum;
    }
    public int setaccount(int naccountnum){
        return accountnum=naccountnum;
    }
}
public class Bank {
    public static void main(String[] args) {
        Accounts a=new Accounts();
        a.setaccount(1234);
        System.out.println(a.getaccount());
    }
}
