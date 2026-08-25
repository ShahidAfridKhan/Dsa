package NewSet.DSA;

import java.util.Arrays;

public class Convert {
    public static String array(String a) {

        a=a.replace(",","");
        String arr[]=a.split("");

        int nums[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nums[i]=Integer.parseInt(arr[i]);
        }

        return String.valueOf(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        System.out.println(Convert.array("1,2,3,4,5"));
    }
}
