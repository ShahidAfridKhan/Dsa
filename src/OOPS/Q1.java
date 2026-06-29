package OOPS;

class Bank{
    void IR(){
    }
}
class SBI extends Bank{
    @Override
    void IR() {
        System.out.println("7%");
    }
}

class ICIC extends Bank{
    @Override

    void IR(){
        System.out.println("8%");
    }
}
class AXIS extends Bank{
    @ Override

    void IR(){
        System.out.println("9%");
    }
}
public class Q1 {
    public static void main(String[] args) {
        Bank b=new ICIC();

        b.IR();

    }
}
