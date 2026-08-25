package OldSet.OOPS.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample2 {
    public static void main(String[] args) {

        int[] nums = {56, 45, 878, 6};

        // All the collections accept only object type
        ArrayList list = new ArrayList();
        list.add(56);
        list.add("Hey");
        list.add(8.2);
        list.add(true);

        System.out.println(list);

        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(56);
        listOfNums.add(45);
        listOfNums.add(878);
        listOfNums.add(5);

        System.out.println(listOfNums); // [56, 45, 878, 5]

        listOfNums.remove(2); // [56, 45, 5]
        System.out.println(listOfNums);
        listOfNums.set(2, 69);
        System.out.println(listOfNums);

        listOfNums.add(2, 699);
        System.out.println(listOfNums);

        // 1. Using standard for loop
        for (int i = 0; i < listOfNums.size(); i++) {
            System.out.print(listOfNums.get(i) + " ");
        }
        System.out.println();

        // 2. Research looping last to first in listOfNums
        System.out.println("Looping last to first:");
        for (int i = listOfNums.size() - 1; i >= 0; i--) {
            System.out.print(listOfNums.get(i) + " ");
        }
        System.out.println();

        // 3. Using ListIterator (Safe way to modify during iteration)
        System.out.println("Using ListIterator:");
        ListIterator<Integer> listIterator = listOfNums.listIterator();
        while (listIterator.hasNext()) {
            Integer num = listIterator.next();
            if (num == 69) {
                listIterator.add(11); // Safe modification
            }
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Using iterator
        Iterator<Integer> iterator = listOfNums.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        listOfNums.removeLast();
        System.out.println("Streams");
        listOfNums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        if (listOfNums.isEmpty()) {
            System.out.println("Empty");
        }

        System.out.println("First and last");
        System.out.println(listOfNums.get(0));
        System.out.println(listOfNums.get(listOfNums.size() - 1));

        System.out.println(listOfNums.getFirst());
        System.out.println(listOfNums.getLast());

        List<Integer> list2 = List.of(56, 65, 4, 425);
        listOfNums.addAll(list2);
        System.out.println(listOfNums);

        listOfNums.clear();
    }
}