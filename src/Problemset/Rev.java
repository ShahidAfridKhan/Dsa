package Problemset;
class Animal{
    void sound(){
        System.out.println("An animal a sound");
    }

    void sound(String type){
        System.out.println("Animal sound" +type);
    }
}

class Dog extends Animal{
    @Override

    void sound(String type){
        System.out.println("Dog barks"+ type);
    }
}
public class Rev {
}
//method with the same name is called method overloading

//complie time polymorphism
