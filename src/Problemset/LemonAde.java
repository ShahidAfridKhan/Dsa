package Problemset;

public class LemonAde {
    public static boolean bro(int nums[]){
        int five=0,ten=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 5) {
                five++;
            } else if (nums[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
       // int  nums[]={5,5,5,10,20};
        int nums[]={5,5,10,10,20};
        System.out.println(bro(nums));

    }
}
