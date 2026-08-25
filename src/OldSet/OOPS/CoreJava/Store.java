package OldSet.OOPS.CoreJava;

public class Store {
    int cusid;
    double bill;
    String name;

    Store(int cusid,double bill,String name){
        this.cusid=cusid;
        this.bill=bill;
        this.name=name;
    }

    void display(){
        System.out.println();
        System.out.println("Id "+cusid);
        System.out.println("bill "+bill);
        System.out.println("name "+name);
    }
    public static void main(String[] args) {
        Store s1[]=new Store[2];
        s1[0]=new Store(1,12.00,"zamal");
        s1[1]=new Store(2,60000.00,"Oreum");

        for(int i=0;i<s1.length;i++){
            s1[i].display();
        }

    }
}
