package OldSet.OOPS.HashMap;
import java.util.*;
public class FrequencyCount {
    public static void main(String[] args) {
       Map<Integer,Integer> map=new HashMap<>();

       int nums[]={1, 1, 2, 3, 3, 3};

       for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
       }
        System.out.println(map);

    }
}
