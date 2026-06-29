package slidingwindowK;

public class Score {
    public static int cons(int nums[]){

        int counter=0;
        int max=0;
        int k=1;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==1) {
                counter++;
            }
            else if(nums[i]==0){
                if(k>0){
                    counter++;
                    k--;

            }else {
                    counter = 0;
                }
            }
            max=Math.max(counter,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1};

        System.out.println(cons(nums));

    }

}
