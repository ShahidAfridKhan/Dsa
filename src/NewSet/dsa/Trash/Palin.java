package NewSet.dsa.Trash;

public class Palin {
    public static void main(String[] args) {
//        String s="A man, a plan, a canal: Panama";
        String s="madam";

        s=s.toLowerCase();
        s=s.replace(":","");
        s=s.replace(",","");
        s=s.trim();
        s.replace(" ","");
        boolean found=true;
        int a=0;
        int b=s.length()-1;
        while(a<b){

            if(s.charAt(a)!=s.charAt(b)){
                found=false;
                    System.out.println("Not Equal");
                    break;
            }
            a++;
            b--;
        }
        if(found){
            System.out.println("equal");
        }


    }
}
