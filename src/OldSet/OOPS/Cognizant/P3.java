package OldSet.OOPS.Cognizant;

public class P3 {
    public static void main(String[] args) {
        int n=4;

        int count=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count<2){
            System.out.println("Prime number");
        }else{
            System.out.println("No prime");
        }
    }
}
