package OldSet.OOPS.CoreJava;

public class Student {

    int id;
    String name;
    int age;

    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        System.out.println("Age "+age);
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"shahid",20);

        s1.display();


    }
}
