package NewSet.DSA.Trash;

public class Palindrome2 {
    public static boolean check(String name){
        int left=0;
        int right=name.length()-1;

        while(left<right){
            if(name.charAt(left)!=name.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(Palindrome2.check("MADAM"));
    }
}
