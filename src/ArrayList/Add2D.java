package ArrayList;
import java.util.*;
public class Add2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("rows");
        int rows=sc.nextInt();
        System.out.println("columns");
        int columns=sc.nextInt();

        int a[][]=new int[rows][columns];
        int b[][]=new int[rows][columns];
        int sum[][]=new int[rows][columns];
        System.out.println("enter 1st matrics");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("second matrics");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
