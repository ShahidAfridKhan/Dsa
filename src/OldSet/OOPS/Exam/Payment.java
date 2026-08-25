package OldSet.OOPS.Exam;
abstract class PayX{
    abstract void pay(int amt);
}
class CardPay extends PayX{
    public void pay(int amt){
        System.out.println("Card payment : "+amt);
    }
}

class UpiPay extends PayX{

    public void pay(int amt)
    {
        System.out.println("UPI payment : "+amt);
    }
}

class Test{
    public static void main(String args[])
    {
        PayX p;
        p=new CardPay();
        p.pay(700);

        p=new UpiPay();
        p.pay(250);
    }
}
