package OldSet.OOPS.Static;

class Shaid{
    static String name;

    static void display(){
        System.out.println("shahid afrid khan");
    }
}



public class Use {
    public static void main(String[] args) {
       // Shaid.display();

        Shaid.name="shahid";

        System.out.println(Shaid.name);
    }
}
