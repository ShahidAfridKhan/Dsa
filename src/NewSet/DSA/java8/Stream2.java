package NewSet.DSA.java8;
import java.util.*;
public class Stream2 {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,20,30,40,50);

        long count=list.stream()
                .count();
        System.out.println(count);

        List<String> names=Arrays.asList("Amit","Rahul","Arun","John");

        names.stream()
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);
    }

}
