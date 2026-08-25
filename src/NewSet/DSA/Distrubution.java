package NewSet.DSA;
import java.util.*;
public class Distrubution {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int nums[]={2,1,3};

        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                if(list1.size()>1&&list2.size()>1) {
                    if (list1.get(list1.size() - 1) > list2.get(list2.size() - 1)) {
                        list1.add(nums[i]);
                        break;
                    } else {
                        list2.add(nums[i]);
                        break;
                    }
                }
            }
            if(i%2==0){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        //System.out.println("List 1"+list1);
        //System.out.println("List 2"+list2);

        list1.addAll(list2);

        int result[]=new int[list1.size()];

        for(int i=0;i<list1.size();i++){
            result[i]=list1.get(i);
        }

        System.out.println(Arrays.toString(result));

    }
}
