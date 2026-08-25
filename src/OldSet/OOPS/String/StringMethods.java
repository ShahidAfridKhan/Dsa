package OldSet.OOPS.String;

public class StringMethods {
    public static void main(String[] args) {
        /*
        OldSet.OOPS.String s3="Apple";

        s3=s3.toLowerCase();
        System.out.println(s3);

        s3=s3.toUpperCase();
        System.out.println(s3);

        s3="Hello Boy";

        char ch=s3.charAt(0);
        System.out.println(ch);

        int c=99;
        OldSet.OOPS.String s4=""+c;

        System.out.println(s4);

        OldSet.OOPS.String str=4343+555+""+959;
        System.out.println(str);

        Scanner sc=new Scanner(System.in);
        OldSet.OOPS.String a=sc.nextLine();
//
//        OldSet.OOPS.String original=a;
//        OldSet.OOPS.String temp="";
//        for(int i=str.length()-1;i>=0;i--){
//            temp+=str.charAt(i);
//        }

*/
        StringBuilder sb=new StringBuilder("Hey");
        sb.append(" ");
        sb.append("How are you");
        sb.append("&");
        System.out.println(sb);
        sb.insert(0,"Hello!");

        System.out.println(sb);
        long start=System.nanoTime();

       // if(str.equals(sb.toString()))
        
    }
}
