package NewSet.dsa.collections.arraylist.test;
import java.util.*;
public class P1RemoveAllOccurrences {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 20, 50));

        TreeSet<Integer> set=new TreeSet<>();

        for(int ans:list){
            set.add(ans);
        }

        System.out.println(set);
    }
}
