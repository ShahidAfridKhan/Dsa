package NewSet.dsa.Trash;
import java.util.*;
public class Repeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String n=sc.nextLine();

        n=n.replaceAll(" ","");

        char arr[]=n.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ans:arr){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }

        System.out.println(map);
        System.out.println(n);

//         */
//        n=n.replaceAll(" ","");
//        System.out.println(n);



    }
}
