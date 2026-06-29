package HashMap;
import java.util.*;
public class DataBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Shahid");
        map.put(2, "Afrid");
       //Add
        map.put(3, "Khan");
        //Remove
        map.remove(1);
       // System.out.println(map.remove(1));
        System.out.println(map);

        String n=sc.nextLine();

        if(map.containsValue(n)) System.out.println("Yes");
        else System.out.println("NO");


    }
}
