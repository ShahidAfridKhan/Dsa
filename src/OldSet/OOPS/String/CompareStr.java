package OldSet.OOPS.String;
import java.util.*;
public class CompareStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Apple";
        String s2 = "ppleA";

        String s3=s1+s2;

        System.out.println(s3);

        System.out.println(s3.contains(s1));

        /*
        OldSet.OOPS.String sql="SELECT * From users\n"
        "WHERE id = 10\n"+
        "AND status = 'ACTIVE';";



        OldSet.OOPS.String sql2 = """
        SELECT * FROM user
        WHERE id = 10;
        AND status = 'ACTIVE';
        """;
         */
    }
}
