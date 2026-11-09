package NewSet.dsa.Trash;

import java.util.Arrays;

public class StringLength {

    static String returnn(String names []){
        String result="";

        for(String name:names){
            result+=name+name.length();
        }
        return result;
    }
    public static void main(String[] args) {
        String[] names={"Java","Python","Spring"};
        System.out.println(returnn(names));
    }
}
