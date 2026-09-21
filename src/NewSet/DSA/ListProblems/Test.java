package NewSet.DSA.ListProblems;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void Listing(List<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static int max(ArrayList<Integer> list){
        int max=list.get(0);

        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }

    static int sum(ArrayList<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
    static int occure(ArrayList<Integer> list){
        int count=0;

        for(int i=0;i<list.size();i++){
            if(list.get(i)==10){
                count++;
            }
        }
        return count;
    }

    static ArrayList<Integer> duplicateremove(ArrayList<Integer> list){
        ArrayList<Integer> result=new ArrayList<>();

        for(int ans:list){
            if(!result.contains(ans)){
                result.add(ans);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
/*
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

 */
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(60);
        list.add(10);

        //Listing(list);
        System.out.println(max(list));
        System.out.println(sum(list));
        System.out.println(occure(list));
        System.out.println(duplicateremove(list));



    }
}
