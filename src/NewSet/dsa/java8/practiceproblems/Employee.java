package NewSet.dsa.java8.practiceproblems;

import java.util.*;
import java.util.stream.Collectors;

abstract class EmployeeOperations{
}
public class Employee {
    private int id;
    private String name;
    private String Department;
    private Double salary;
    private int age;
    private int Experience;


    Employee(int id, String name, String Department, Double salary, int age, int Experience) {
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.salary = salary;
        this.age = age;
        this.Experience = Experience;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getdepartment() {
        return Department;
    }

    public Double getsalary() {
        return salary;
    }

    public int getage() {
        return age;
    }

    public int getexperience() {
        return Experience;
    }
/*
    public List<Employee> getEmployeeans(List<Employee> list){
        return list.stream()
                .filter(i->i.getsalary()>50000)
                .collect(Collectors.toList());
    }

 */


    void displayDetails() {
        System.out.print("id: " + id + " | ");
        System.out.print("name: " + name + " | ");
        System.out.print("Department: " + Department + " | ");
        System.out.print("salary: " + salary + " | ");
        System.out.print("Age: " + age + " | ");
        System.out.println("Experience: " + Experience);
    }

}



class Manager extends Employee{
       private int teamsize;

        public Manager(int id,String name,String department,double salary,int age,int experience,int teamsize){
           super(id,name,department,salary,age,experience);
           this.teamsize=teamsize;
        }
        public int getteamsize(){
            return getteamsize();
        }
        void displayDetails(){
            super.displayDetails();
            System.out.println("Team Size"+ teamsize);
        }
}


class main{
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul", "IT", 60000.0, 25, 3);
        Employee e2 = new Employee(2, "Priya", "HR", 45000.0, 28, 5);
        Employee e3 = new Employee(3, "Kiran", "IT", 80000.0, 30, 7);
        Employee e4 = new Employee(4, "Sneha", "Finance", 55000.0, 26, 4);
        Employee e5 = new Employee(5, "Arjun", "IT", 95000.0, 32, 9);
        Employee e6 = new Employee(6, "Divya", "HR", 50000.0, 24, 2);
        Employee e7 = new Employee(7, "Varun", "Finance", 70000.0, 29, 6);
        Employee e8 = new Employee(8, "Anjali", "IT", 40000.0, 23, 1);
        Employee e9 = new Employee(9, "Rohan", "Sales", 65000.0, 31, 8);
        Employee e10 = new Employee(10, "Meena", "Sales", 75000.0, 27, 5);
        Manager m1=new Manager(101,"Shahid","IT",300000.0,21,1,15);
        Manager m2=new Manager(102,"Afrid","Finance",400000.0,29,8,28);

        List<Manager> mlist=Arrays.asList(m1,m2);
        List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);

        list.stream()
                .forEach(i-> System.out.println(i.getname()));
        System.out.println("-------================---------=============----------=========");
        list.stream()
                .filter(i->i.getsalary()>60000)
                .forEach(i-> System.out.println(i.getname()));

        list.stream()
                .filter(i->i.getdepartment()=="IT")
                .forEach(i-> System.out.println(i.getname()));

//        list.stream()
//                .
        System.out.println("-----------------------------------------------------");
        list.stream()
                .filter(i->i.getage()>25)
                .forEach(i-> System.out.println(i.getname()));
        System.out.println("------------------------------------------------------");

        list.stream()
                .sorted(Comparator.comparingDouble(i->i.getsalary()))
                .forEach(i-> System.out.println(i.getname()+" - "+i.getsalary()));
        list.stream()
                .max(Comparator.comparingDouble(i->i.getsalary()))
                .ifPresent(i-> System.out.println(i.getname()+"-"+i.getsalary()));


        System.out.println();
        System.out.println("------------------------------------------------------");


        Map<String,List<Employee>> result=list.stream()
                .collect(Collectors.groupingBy(i->i.getdepartment()));
        System.out.println(result);

        Map<String,Long> get=list.stream()
                .collect(Collectors.groupingBy(i->i.getdepartment(),Collectors.counting()));
        System.out.println(get);

      //  List<Integer> l=Arrays.asList(10,20,30,40,50);

//        list.stream()
//                .sorted(Comparator.comparingDouble(i->i.getsalary()))
//                .forEach(i-> System.out.println(i.getname()+" - "+i.getsalary()));
        System.out.println("---------------------------");
        list.stream()
                .sorted(Comparator.comparingDouble(i->i.getsalary()))
                .forEach(i-> System.out.println(i.getname()+" "+i.getsalary()));












    }
}
