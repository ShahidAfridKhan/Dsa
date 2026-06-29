package HashMap;
import java.util.*;
public class DSCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashMap<Integer,Integer> map=new HashMap<>();

     //   Stack<Integer> st=new Stack<>();
        int nums[]={1,2,1,4,5,6,7,8};

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }


        for(int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        //System.out.println(map.getOrDefault(1,0)+1);



    }
}
