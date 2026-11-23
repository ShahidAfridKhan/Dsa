package NewSet.dsa.restart.threads;


class A extends Thread
{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread
{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Sample {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();

        obj.start();
        obj1.start();
    }
}
