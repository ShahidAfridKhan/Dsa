package NewSet.DSA.Trash;
import java.util.*;
public class NonRepeatingf {
    public static void main(String[] args) {
        String name = "sebdizubckwebfsdk";
        char arr[] = name.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ans : arr) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        for(char res:arr){
            if(map.get(res)==1){
                System.out.println(res);
                break;
            }
        }
    }
}
