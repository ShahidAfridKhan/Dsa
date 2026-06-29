package arrays;
import java.util.*;
public class UserInput2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int row=sc.nextInt();
        System.out.println("Enter the columns");
        int cols=sc.nextInt();
        int arr[][]=new int[row][cols];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2d array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
