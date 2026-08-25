package OldSet.OOPS;
class Emp{
    void calculate(int sal){
    }
}

class Manager extends Emp{
    @Override

    void calculate(int sal){

        System.out.println("Manager Sal: "+sal);
    }
}

class Developer extends Emp{
    @Override

    void calculate(int sal){
        System.out.println("Developer sal: "+sal);
    }
}
class Tester extends Emp{
    @Override

    void calculate(int sal){
        System.out.println("Tester sal: "+sal);
    }
}
public class Employee {
    public static void main(String[] args) {
        Emp e=new Developer();

        e.calculate(600000);
    }
}
