package OldSet.OOPS.Problemset;
class Vehicle{
    void start(){
        System.out.println("Starting car...........");

    }
    void stop(){
        System.out.println("Car stopping");
    }
}
class Car extends Vehicle{
    void honk(){
        System.out.println("POPPP!!!");
    }
}
public class Revision {
    public static void main(String[] args) {
        Car v1=new Car();
        v1.start();
        v1.stop();
        v1.honk();
    }
}
