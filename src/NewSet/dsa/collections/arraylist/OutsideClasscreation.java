package NewSet.dsa.collections.arraylist;

import java.util.ArrayList;
import java.util.*;
public class OutsideClasscreation {
    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,20,304,505));

    public void marks() {
        for(int ans:list){
            System.out.print(list+" ");
        }
    }
}
