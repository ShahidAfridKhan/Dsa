package NewSet.DSA.Trash;

public class Palindrome {
    public static void main(String[] args) {
        String a="MADAM";

        int left=0;
        int right=a.length()-1;

        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                System.out.println("No bro");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Yes");

    }
}
