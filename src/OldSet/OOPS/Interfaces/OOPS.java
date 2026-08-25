package OldSet.OOPS.Interfaces;


interface Animal{
    int eyes=2;
    void walk();

}
class Horse implements Animal{
    public void walk(){
        System.out.println("HIIIIII");
    }
    public void game(){
        System.out.println("hihiih");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse horse=new Horse();

        horse.walk();
        horse.game();
    }
}
