package OldSet.OOPS.HashMap;
import java.util.*;
public class CreateHash {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        map.put(1, "Shahid");
        map.put(2,"Arjun");
        map.put(3,"Khan");
        map.put(4,"Nike");

        System.out.println(map);

        System.out.println(map.get(1));

        //Check

        String n=sc.nextLine();
        if(map.containsValue(n)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
