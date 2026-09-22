package NewSet.DSA.Strings;
import java.util.*;
public class Occurrance {
    public static void main(String[] args) {
        String a="aassffggw";
        char arr[]=a.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ans:arr){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
        System.out.println(map);

        for(char ans:arr){
            if(map.get(ans)==1){
                System.out.println(ans);
                break;
            }
        }
    }
}
