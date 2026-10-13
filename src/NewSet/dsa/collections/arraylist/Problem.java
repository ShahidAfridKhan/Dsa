package NewSet.dsa.collections.arraylist;
import java.util.*;
public class Problem {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
/*

        ArrayList<String> names=new ArrayList<>();

        names.add("shahid");
        names.add("Afrid");
        names.add("Khan");

        System.out.println(names);

 */
        System.out.println(l1.get(2));
        System.out.println(l1.set(3,69));
        System.out.println(l1.contains(69));
        System.out.println(l1.size());
        System.out.println(l1);

        for(int ans:l1){
            System.out.print(ans+" ");
        }
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
        }
        Iterator<Integer> it=l1.iterator();

        while(it.hasNext()){
            System.out.print(it.next() +" x");
        }



    }
}
