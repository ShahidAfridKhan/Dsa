package NewSet.dsa.collections.arraylist;
import java.util.*;
public class MarksAreGreaterthan50 {
    public static void main(String[] args) {

        ArrayList<Integer> marks=new ArrayList<>(Arrays.asList(35,80,45,90,909));

        for(int ans:marks){
            if(ans>50){
                System.out.print(ans+" ");
            }
        }

        ArrayList<String> names=new ArrayList<>(Arrays.asList("Shahid","Shahid","Afrid","Shahid","Khan","Shahid"));

//        HashSet<String> set=new HashSet<>();
//        for(String ans:names){
//            set.add(ans);
//        }
//        System.out.println(set);
        Scanner sc=new Scanner(System.in);

        //String n=sc.nextLine();
//        for(String ans:names){
//            if(n==ans){
//                names.remove(ans);
//            }
//        }
//        for(String ans:names) {
//            System.out.println(names.remove(n));
//        }
        /*
        for(String ans:names){
            if(ans.equals("Shahid")){
                names.remove(ans);
            }
        }

         */
       // System.out.println(names);
        String n=sc.nextLine();
        for(int i=0;i<names.size();i++){
            if(names.get(i).equals(n)){
                names.remove(i);
                i--;
            }
        }
        System.out.println(names);
    }
}
