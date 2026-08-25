package NewSet.DSA;

public class Largest {
    public static String largest(String name){
        String ch[]=name.split("");
        int nums[]=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            nums[i]=Integer.parseInt(ch[i]);
        }

        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        return String.valueOf(max);
    }


    public static void main(String[] args) {
        System.out.println(Largest.largest("12345"));
    }
}
