package NewSet.DSA.Strings;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        HashSet<Character> set =new HashSet<>();

        String a="ghjklsdkrjiofujlewndsuofddjddjdjsssssss";
        char arr[]=a.toCharArray();

        for(char an:arr){
            set.add(an);
        }
        StringBuilder sb=new StringBuilder();

        for(char an:set){
            sb.append(an);
        }
        System.out.println(sb);
    }
}
