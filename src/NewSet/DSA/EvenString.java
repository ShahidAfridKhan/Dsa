package NewSet.DSA;

public class EvenString {
    static String even(String n){
        String arr[]=n.split("");

        int nums[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nums[i]=Integer.parseInt(arr[i]);
        }

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        return String.valueOf(count);
    }

    public static void main(String[] args) {
        System.out.println(EvenString.even("583216"));
    }
}
