package NewSet.DSA.java8;
import java.util.*;
public class Imp {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,20,304,48,10,20);
        list.stream()
                .distinct()
                .forEach(n-> System.out.println(n));
    }
}
