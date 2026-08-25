package OldSet.OOPS.CoreJava;
import java.util.*;
//this includes the store products and the CRUD operations
public class Product {
    int pId;
    String pName;
    double price;
    int qant;

    Product(int pId,String pName,double price,int qant){
        this.pId=pId;
        this.pName=pName;
        this.price=price;
        this.qant=qant;
    }

    void display(){
        System.out.println("-----------------------------------");
        System.out.println("id "+pId );
        System.out.println("pName "+pName);
        System.out.println("price "+price);
        System.out.println("qant "+qant);
    }

    public static void main(String[] args) {
        Product p1[]=new Product[3];
        Scanner sc=new Scanner(System.in);
        p1[0]=new Product(101,"Chock",20,20);
        p1[1]=new Product(102,"Biscuit",110,45);
        p1[2]=new Product(103,"Cream",19,200);

        for(int i=0;i<p1.length;i++){
            p1[i].display();
        }
        //Search Product
        System.out.println("Enter the product which you want to search");
        int searchId=sc.nextInt();
        boolean found=false;

        for(int i=0;i<p1.length;i++){
            if(p1[i]!=null && p1[i].pId==searchId){
                p1[i].display();

                found=true;
                break;
            }
        }
        if(!found) System.out.println("Priduct Not found");

        //Delete Product

        System.out.println("\nProduct to delete: ");
        int deleteId=sc.nextInt();
        for(int i=0;i<p1.length;i++){
            if(p1[i]!=null && p1[i].pId==deleteId){
                p1[i]=null;
                System.out.println("Product Deleted Success");

                found=true;
                break;
            }
        }
        if(!found) System.out.println("Ni bhai product hee ni hey");

        System.out.println("\nAfter Delted");

        for(int i=0;i<p1.length;i++){
            if(p1[i]!=null){
                p1[i].display();
            }
        }
    }
}
