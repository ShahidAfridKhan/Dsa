package OOPS;

class Student{
    String name;
    int RollNo;
    int marks;

    Student(String name,int RollNo,int marks){
        this.name=name;
        this.RollNo=RollNo;
        this.marks=marks;
    }
    void displaydetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+RollNo);
        System.out.println("Marks: "+marks);
    }
}

public class FinalQuestion {
    public static void main(String[] args) {
        Student s1=new Student("Shahd",37,88);

        s1.displaydetails();
    }
}
