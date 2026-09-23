package NewSet.DSA.Trash;
import java.util.*;
public class FindDuplicatates {
    public static void main(String[] args) {
        String a="bdjsdjfhlufhnvdioslhflhesuch";


        char arr[]=a.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set=new HashSet<>();
       for(char res:arr){
           if(map.get(res)>1){
               set.add(res);
           }
       }

       for(char fin:set){
           sb.append(fin);
       }
        System.out.println(sb);
    }
}
