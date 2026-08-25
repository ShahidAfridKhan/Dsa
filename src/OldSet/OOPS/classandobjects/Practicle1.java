package OldSet.OOPS.classandobjects;
// this is on the topic Class and the objects
//College managment system
//rectalngle
class Circle{
    double length;
    double width;

    Circle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double answer(){

        return length * width;
    }

    public void  display(){
        System.out.println(answer());
    }
}

public class Practicle1 {

    public static void main(String[] args) {
        Circle c1=new Circle(2,8);

        c1.display();
    }
}
