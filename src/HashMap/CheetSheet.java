package HashMap;
import java.util.*;
public class CheetSheet {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();

        System.out.println(map.put(1,55));
        System.out.println(map.get(1));

        System.out.println(map.containsKey(1));
        System.out.println(map.getOrDefault(2,0));
        System.out.println(map.remove(1));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

    }

}
