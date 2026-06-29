package OOPS.classandobjects;

import java.util.*;
class Car{

    String name;
    String type;
    public void print(){//Method
        System.out.println("this is the car and the specification "+ name + " this "+ type);
    }
}
// USE of constructor()

// actullay without creating the each and every name for the single single object
// with the constructor we can abel to access the all character in the single names;


class Student{
    String name;
    int age;
    String college;

    Student(String name,int age, String college){
        this.name=name;
        this.age=age;
        this.college=college;
    }

    void print(){
        System.out.println(name+" "+age+" "+college);
    }

    public int ret(int a,int b){
        return a+b;
    }
}
public class ClassNobjects {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
/*
        Car c1=new Car();
        System.out.println("anem");
        c1.name=sc.nextLine();
        System.out.println("model");
        c1.type=sc.nextLine();
        c1.print();


 */
        Student s1=new Student("shahid",33,"LPU");
        Student s2=new Student("afrid",77,"SRM");
        s1.print();
        s2.print();
       // Student s3=new Student(s1);
        System.out.println(s2.ret(1,2));
    }
}
