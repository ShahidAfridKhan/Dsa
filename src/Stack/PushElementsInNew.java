package Stack;
import java.util.*;

public class PushElementsInNew {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack <Integer> st=new Stack<>();

        /*stack with the user input Boss
        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

         */
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//        Stack <Integer> st1=new Stack<>();
//        while(st.size()>1){
//            st.push(st1.pop());
//        }
//        System.out.println(st1);

        st.peek();
        System.out.println(st.peek());


    }
}
