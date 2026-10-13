package NewSet.dsa.Trash;
import java.util.*;
public class DuplicateNumbers {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,6,6,77,7,7,8,8,10,10};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ans:nums){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
        HashSet<Integer> set =new HashSet<>();

        for(int res:nums){
            if(map.get(res)>1){
                set.add(res);
            }
        }
        System.out.println(set);
    }
}
