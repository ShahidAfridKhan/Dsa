package OldSet.OOPS.TCSPrime;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=60;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                System.out.println(i);
            }
        }
        /*
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("No");
        }

         */
    }
}
