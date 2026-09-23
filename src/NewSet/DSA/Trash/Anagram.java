package NewSet.DSA.Trash;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";

        char a1[]=a.toCharArray();
        char a2[]=b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
