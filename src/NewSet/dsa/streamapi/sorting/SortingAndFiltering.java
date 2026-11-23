package NewSet.dsa.streamapi.sorting;
import java.util.*;
public class SortingAndFiltering {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(50,10,40,20,30);
/*
        numbers.stream()
                .sorted()
                .forEach(i-> System.out.print(i+" "));



        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i-> System.out.println(i+" "));

        numbers.stream()
                .distinct()
                .forEach(i-> System.out.println(i+" "));


        numbers.stream()
                .limit(3)
                .forEach(i-> System.out.println(i+" "));

 */
        numbers.stream()
                .skip(2)
                .forEach(i-> System.out.println(i+" "));



    }
}
