package Collections;
import java.util.*;
public class list {
    public static void main(String[] args) {
        List <String> listnames=new ArrayList<>();

       Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();


        listnames.add("sjajid");
        listnames.add("shiufeuo");

        listnames.add("khan");

        if(listnames.contains(name)){
            System.out.println("present");
        }else{
            System.out.println("no there");
        }




    }
}
