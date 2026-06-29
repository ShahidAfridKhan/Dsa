package Collections;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.addFirst(3);
        list.addLast(9000);

        System.out.println(list);

        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        System.out.println(list.set(0,799));
        System.out.println(list);

        System.out.println(list.remove(5));
        System.out.println(list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
