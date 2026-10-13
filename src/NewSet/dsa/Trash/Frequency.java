package NewSet.dsa.Trash;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,4,3,2,2,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ans:nums){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }

        System.out.println(map);
    }
}
