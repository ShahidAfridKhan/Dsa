package OldSet.OOPS.CoreJava;

public class Library {
    int id;
    String name;
    int age;
    String course;

    Library(int id,String name,int age,String course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void display(){
        System.out.println("Id "+id);
        System.out.println("Name "+name);
        System.out.println("age "+age);
        System.out.println("Course "+course);
    }
    void condition(){
        if(course=="AI/ML"){
            System.out.println("Related Hire");
        }else{
            System.out.println("I dont want him");
        }
    }

    public static void main(String[] args) {
        Library l1=new Library(1,"Shahid",20,"AI/ML");
        l1.display();
    }
}
