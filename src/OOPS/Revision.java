package OOPS;



class Animal{
    void Sound(){
        System.out.println("animal makes sound....");

    }
    void Sound(String sound){
        System.out.println("sound "+sound);
    }
}
class Dog extends Animal{

    @Override
    void Sound(String sound){
        System.out.println("Dog make sound this: "+sound);

    }
}
public class Revision {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.Sound("wouf!!");

    }

}
