package NewSet.DSA.Trash;
import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        String n="fghjklfghjkgf";
        char arr[]=n.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Character> set=new HashSet<>();
        for(char a:arr){
            if(map.get(a)>1){
                set.add(a);
            }
        }
        StringBuilder sb=new StringBuilder();

        for(char re:set){
            sb.append(re);
        }
        System.out.println(sb);

    }
}
