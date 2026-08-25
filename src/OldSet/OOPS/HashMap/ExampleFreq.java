package OldSet.OOPS.HashMap;
import java.util.*;
public class
ExampleFreq {
    public static void main(String[] args) {
        int nums[]={4,2,4,5,2,3,1,1};

        Map<Integer,Integer> map=new HashMap<>();
        int index=0;
        for(int num:nums){
            map.put(num,index);
            index++;
        }
        System.out.println(map);
    }
}
