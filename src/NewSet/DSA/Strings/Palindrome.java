package NewSet.DSA.Strings;

public class Palindrome {
    static boolean check(String n){
        int left=0;
        int right=n.length()-1;

        while(left<right){
            if(n.charAt(left)!=n.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(check("maedam"));
    }
}
