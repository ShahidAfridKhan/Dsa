package HashMap;
import java.util.*;
public class InternalWork {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("shahid",999);
        map.put("Afrid",1);
        map.put("Afrd",1);
        map.put("uu",0) ;
        map.put("shaifh",100);
        System.out.println(map);

        System.out.println(map.containsValue(100));
    }
}
