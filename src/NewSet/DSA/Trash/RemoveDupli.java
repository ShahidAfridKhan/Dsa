package NewSet.DSA.Trash;
import java.util.*;
public class RemoveDupli {
    public static void main(String[] args) {
        String name="fghasjodzjcnljesk";
        char arr[]=name.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for(char ans:arr){
            set.add(ans);
        }
        StringBuilder sb=new StringBuilder();

        for(char c:set){
            sb.append(c);
        }

        System.out.println(sb);
    }
}
