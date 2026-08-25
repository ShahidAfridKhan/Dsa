package OldSet.OOPS.Cognizant;

public class P2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before a: "+a);
        System.out.println("Before b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After a: "+a);
        System.out.println("After b: "+b);
    }
}
