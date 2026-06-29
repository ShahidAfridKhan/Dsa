package Collections;
import java.util.*;
public class set {
    public static void main(String[] args) {

        Set<Integer> list=new HashSet<>();

        list.add(122);
        list.add(900);
        list.add(434);
        list.add(9);
        list.add(9);

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(list.contains(n)){
            System.out.println("haa it is there");
        }else{
            System.out.println("ledu raa babu");
        }

        System.out.println(list);
    }
}
