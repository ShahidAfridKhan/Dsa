package NewSet.DSA.Strings;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        /*
        String s="Shahid";
        s=s.concat(" Hello");
      //  String b="Afrid";
        System.out.println(s+" " +b);




        String a="CAT";
        String b="CAT";

        System.out.println(a==b);

        String c=new String("CAT");
        String d=new String("CAT");
        System.out.println(a==c);
        System.out.println(a.equals(d));

         */

        String a="Shaihidafridkhan";

        System.out.println(a.length());
        System.out.println(a.charAt(4));

        System.out.println(a.substring(4));
        System.out.println(a.substring(1,4));

        System.out.println(a.toUpperCase());

        String s="hi My Name Is Shahid Afrid Khan  ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));

        String ss="howareyou";

        char arr[]=ss.toCharArray();
        System.out.println(Arrays.toString(arr));


    }
}
