package OldSet.OOPS.String;

public class Basics {
    public static void main(String[] args) {
        String s2="Hello World";
        String s3="Hwllo World";

        String s1=new String("Hello Kity");
        String s4=new String("Hello Kity");

        if(s1==s4){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(s1.equals(s2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        String s5="A Raa";
    }
}
