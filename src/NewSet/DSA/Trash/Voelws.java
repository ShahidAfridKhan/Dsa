package NewSet.DSA.Trash;

public class Voelws {
    public static void main(String[] args) {
        String name="Shahid";

        char arr[]=name.toCharArray();
        int v=0;
        int c=0;
        for(char a:arr){
            if(a=='a' || a=='e'||a=='i'||a=='o'||a=='u'){
                v++;
            }else{
                c++;
            }
        }
        System.out.println("volerss "+v);
        System.out.println("consonents "+c);
    }
}
