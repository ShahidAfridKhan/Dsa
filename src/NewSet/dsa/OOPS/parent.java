package NewSet.dsa.OOPS;

public class parent {
    int sha=10000;
    public void print(){
        System.out.println("hi");
    }
}
class child extends parent{
    public void printt(){
        System.out.println("ihi");
    }
}
class main{
    public static void main(String[] args) {
        child c=new child();
        c.print();
    }
}
