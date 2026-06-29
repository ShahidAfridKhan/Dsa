package CoreJava;

public class Employee {
    int empId;
    String name;
    int Sal;
    String dep;

    Employee(int empId,String name,int Sal,String dep){
        this.empId=empId;
        this.name=name;
        this.Sal=Sal;
        this.dep=dep;
    }

    void display(){
        System.out.println("---------------------");
        System.out.println("EmpId "+empId);
        System.out.println("Name "+name);
        System.out.println("sal "+Sal);
        System.out.println("dep "+dep);
        System.out.println("Annual sal== "+Sal*12);
    }
    public static void main(String[] args) {
       // Employee e1=new Employee(101,"shahid",100000,"HR");
        Employee emp[]=new Employee[3];
        emp[0]=new Employee(101,"Shaid",100000,"HR");
        emp[1]=new Employee(102,"Afrid",200000,"Medical");
        emp[2]=new Employee(103,"Khan",300000,"Main");

        for(int i=0;i<emp.length;i++){
            emp[i].display();
        }
    }
}
