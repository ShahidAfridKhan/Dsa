package OOPS.Static;

class Student{
    static int number;


    static void inter(){
        System.out.println("name");
    }
}
public class oops {
    public static void main(String[] args) {
        Student.number=123;
        Student.inter();
    }
}
