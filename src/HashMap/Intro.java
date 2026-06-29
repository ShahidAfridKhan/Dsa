package HashMap;
import java.util.*;
public class Intro {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();

//        map.put(1, 10);
  //      map.put(2, 20);

      //  System.out.println(map.get(1));
        int nums[]={1,2,3,4,5,6,7};

        for(int ans:nums){
            map.put(ans,ans);
        }

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(map.containsKey(n)) System.out.println("Yes number is there at position "+map.get(n));
        else System.out.println("No sorry");
    }
}
