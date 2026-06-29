package String;

public class stringprinting {
    public static void main(String[] args) {
        String str="Abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
