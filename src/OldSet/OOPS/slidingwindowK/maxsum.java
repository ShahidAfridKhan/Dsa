//import java.util.*;
//class Main{
//    public static void main(OldSet.OOPS.String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int nums[]=new int[n];
//        for(int i=0;i<n;i++){
//            nums[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        int maxsum=0;
//        int currentsum=0;
//
//        for(int i=0;i<k;i++){
//            currentsum+=nums[i];
//        }
//        int maxsum=currentsum;
//        for(int i=k;i<nums.length;i++){
//            currentsum+=nums[i]+
//        }
//    }
//}
//
import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];//10
        }
        int max=sum; //max=10
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(sum,max);//sum empty
        }
        System.out.println(max);
    }
}
