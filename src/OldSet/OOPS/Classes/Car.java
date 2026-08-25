package OldSet.OOPS.Classes;

public class Car {
    int CarId;
    String CarName;

    Car(int CarId,String CarName){
        this.CarId=CarId;
        this.CarName=CarName;
    }
    public static void main(String[] args) {
        Car c=new Car(1,"BEnz");
    }
}
