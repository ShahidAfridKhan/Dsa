package NewSet.dsa.miniprojects.studentmanagmentsystem;
/*
import java.util.*;
public class Student
{
    private String name;
    private int studentId;
    private String email;
    private Map<String,String> courses;

    Student(String name,int studentId,String email){
        this.name=name;
        this.studentId=studentId;
        this.email=email;
        this.courses=new HashMap<>();
    }

   private double getGradePoints(String grade){
        switch(grade.toUpperCase()){
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;

            default: return 0.0;
        }
   }
   public void entollCourse(String courseName,String grade){
        if(courseName==null || courseName.trim().isEmpty()){
            throw new IllegalArgumentException("Course name cannot be null or empty");
        }
        if(grade==null || grade.trim().isEmpty()){
            throw new IllegalArgumentException("Enter the grade dude")
        }

        String upperGrade=grade.trim().toUpperCase();

        if(!upperGrade.matches("A|B|C|D")){
            throw new IllegalArgumentException("Grade Mucst be the A|B|C|D|F");
        }
         courses.put(courseName.trim(),upperGrade);
       System.out.println("Enrolled in "+courseName+" With Grade "+ upperGrade);
   }

   public double getGPA(){
        if(courses.isEmpty()){
            return 0.0;
        }

        double totalGradepoints=0.0;

        for(String grade:courses.values()){
            totalGradepoints+=getGradePoints(grade);
        }
        return totalGradepoints/courses.size();
   }





}

 */
