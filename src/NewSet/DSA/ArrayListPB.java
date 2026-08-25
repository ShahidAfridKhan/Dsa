package NewSet.DSA;
import java.util.*;
public class ArrayListPB {
    public static int maxelement(List<Integer> list,int n){

        int max=Collections.max(list);

        for(int i=0;i<n;i++){
            list.set(i,max);
        }
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=list.get(i);
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int result=maxelement(list,n);
        System.out.println(result);

    }
}
