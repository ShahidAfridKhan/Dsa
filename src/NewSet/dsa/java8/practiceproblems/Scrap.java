package NewSet.dsa.java8.practiceproblems;
import java.util.*;
public class Scrap {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,30,40,50,60);

        list.stream()
                .sorted()
                .forEach(i-> System.out.print(i+" "));
        System.out.println();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i-> System.out.print(i+" "));
        System.out.println();

        list.stream()
                .sorted();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i-> System.out.println(i+" "));

        // Improved version with filter, map, limit, method reference
        list.stream()
                .filter(n -> n > 25)
                .map(n -> n * 2)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

    }
}
