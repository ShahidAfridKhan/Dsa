package NewSet.dsa.java8.practiceproblems;
import java.util.*;
public class Product {
    private String name;
    private double price;
    private double rating;


    Product(String name,double price,double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }

    void setname(){
        this.name=name;
    }
    void setprice(){
        this.price=price;
    }
    void setrating(){
        this.rating=rating;
    }

    String getname(){
        return name;
    }
    double getprice(){
        return price;
    }
    double getrating(){
        return rating;
    }

    void getdetails(){
        System.out.print(name+" | ");
        System.out.print(price+" | ");
        System.out.println(rating);
    }
}
class access{
    public static void main(String[] args) {
        Product p = new Product("Laptop", 15000, 4.5);
        Product p2 = new Product("Mobile", 20000, 4.2);
        Product p3 = new Product("Charger", 2000, 5.0);

        List<Product> list = Arrays.asList(p, p2, p3);

        for (Product a : list) {
            a.getdetails();
        }
        list.stream()
                .sorted(Comparator.comparingDouble(i -> i.getrating()))
                .forEach(i -> System.out.println(i.getname() + " " + i.getprice() + " " + i.getrating()));



    }
}
