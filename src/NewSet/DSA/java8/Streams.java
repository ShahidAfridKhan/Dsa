package NewSet.DSA.java8;
import java.util.*;
public class Streams {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,10,10,30,20,30,40,50);

        l.stream()
                .forEach(n-> System.out.print(n+" "));
        System.out.println();
        l.stream()
                .filter(n->n%2==0)
                .forEach(n-> System.out.print(n+" "));
        l.stream()
                .filter(n->n>10)
                .forEach(n-> System.out.println(n));

        l.stream()
                .map(n->n*n)
                .forEach(n-> System.out.println(n));

        l.stream()
                .distinct()
                .forEach(n->System.out.println(n));

        int sum=l.stream()
                .mapToInt(n->n)
                .sum();
        System.out.println(sum);

        int um=l.stream()
                .mapToInt(n->n)
                .sum();

        System.out.println(um);

         int max=l.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println(max);

        int min=l.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(min);


        List<Integer> list=Arrays.asList(1,2,3,4,5,5,4,3,2,1);

        list.stream()
                .sorted()
                .forEach(n-> System.out.println(n));

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        long count = nums.stream()
                .count();

        System.out.println(count);

    }
}
