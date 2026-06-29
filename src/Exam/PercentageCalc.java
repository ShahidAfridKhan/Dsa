package Exam;
import java.util.*;
class Student {
    String name;
    int marksObtained;
    static String collegeName = "LPU";
    static final int MAX_MARKS = 100;
    Student(String name, int marksObtained) {
        this.name = name;
        this.marksObtained = marksObtained;
    }
    public void printPercentage() {
        double percentage = (marksObtained / (double) MAX_MARKS) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
public class PercentageCalc {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        String Name=sc.nextLine();
        System.out.println("Marks");
        int Marks=sc.nextInt();
        Student s1 = new Student(Name,Marks);
        System.out.println("Name: " + s1.name);
        System.out.println("College: " + Student.collegeName);
        System.out.println("Marks Obtained: " + s1.marksObtained);
        s1.printPercentage();
        System.out.println();
    }
}
