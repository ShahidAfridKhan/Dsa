package NewSet.dsa.collections.arraylist;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(Access.marks(list));
        OutsideClasscreation o1=new OutsideClasscreation();

        o1.marks();
    }
}
