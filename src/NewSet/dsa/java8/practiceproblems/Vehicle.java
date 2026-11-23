package NewSet.dsa.java8.practiceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vehicle {
    private String vehicleNumber;
    private String brand;
    private Double price;
    private String fueltype;


    Vehicle(String vehicleNumber, String brand, Double price, String fueltype) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.price = price;
        this.fueltype = fueltype;
    }

    public String getnumber() {
        return vehicleNumber;
    }

    public String getbrnad() {
        return brand;
    }

    public double getprice() {
        return price;
    }

    public String getfueltype() {
        return fueltype;
    }

    public void displayDetails(){
        System.out.print("number "+vehicleNumber+" | ");
        System.out.print("brand "+brand+" | ");
        System.out.print("price "+price+" | ");
        System.out.print("fueltype "+fueltype+" | ");
    }


}
class Car extends Vehicle{
    private int seatingCapacity;
    private String carType;
    Car(String vehicleNumber, String brand, Double price, String fueltype,int seatingCapacity,String carType){
        super(vehicleNumber,brand,price,fueltype);
        this.seatingCapacity=seatingCapacity;
        this.carType=carType;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.print("seatingCapacity: "+seatingCapacity+" | ");
        System.out.println("carType: "+carType);
    }
}
class Shahid{
    public static void main(String[] args) {
        Vehicle v=new Car(" AP39AB1234","Toyota",1500000.0,"Petrol",5," SUV");

        List<Vehicle> list= Arrays.asList(v);

        for(Vehicle e:list){
            e.displayDetails();
        }



    }
}
