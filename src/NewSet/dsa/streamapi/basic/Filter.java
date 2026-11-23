package NewSet.dsa.streamapi.basic;
import java.util.*;
public class Filter {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,30,40,50);

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        list.stream()
                .filter(i->i>25)
                .forEach(System.out::println);

        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8);

        l.stream()
                .map(i->i*i)
                .forEach(System.out::println);

       // List<String> s=Arrays.asList("shahid","rahul","amit","john");

        List<String> name=new ArrayList<>();
        name.add("Shaid");
        name.add("rahul");
        name.add("khan");
        name.add("pathan");


        name.stream()
                .map(i->i.toUpperCase())
                .forEach(System.out::println);

        List<Integer> n=Arrays.asList(10,45,20,60,15,30,5,80);


        long count=n.stream()
                .filter(i->i>25)
                .count();
        System.out.println(count);


    }
}
