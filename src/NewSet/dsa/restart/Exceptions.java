package NewSet.dsa.restart;
import java.util.*;
public class Exceptions {
    public static void main(String[] args) {
        int a=10;
        try{
            System.out.println(a/0);
        }catch(Exception e){
            System.out.println("No bro You are completely wrong");
        }
    }
}
