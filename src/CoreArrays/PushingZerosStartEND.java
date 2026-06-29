package CoreArrays;
public class PushingZerosStartEND {
    public static void start(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - i - 1; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
    public static void end(int n[]){
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length-i-1;j++){
                if(n[j]<n[j+1]){
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 4, 5, 0, 3, 0, 0, 2};

        start(n);
        System.out.println();
        end(n);
    }

}
