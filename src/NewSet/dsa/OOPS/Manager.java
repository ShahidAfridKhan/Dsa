package NewSet.dsa.OOPS;

public class Manager {
    String name="Shahid";
    void print(){
        System.out.println("Im the Manager");
    }
}
class Employee extends Manager{
    void manage(){
        System.out.println("Im the employee");
    }
}
class Fresher extends Employee{
    void many(){
        System.out.println("Im the Fresher"+name);
    }
}

class Main{
    public static void main(String[] args) {
       Fresher m=new Fresher();
       m.many();
       m.manage();
       m.print();
    }
}