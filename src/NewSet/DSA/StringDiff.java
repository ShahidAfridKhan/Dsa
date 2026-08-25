package NewSet.DSA;

public class StringDiff {
    static String unique(String name){
        name=name.replace("$","").replace("[]","").trim();

        String arr[]=name.split("");



        int nums[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nums[i]=Integer.parseInt(arr[i]);
        }
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return String.valueOf(max);
    }

    public static void main(String[] args) {
        System.out.println(StringDiff.unique(" $123$123[]456"));
    }
}
