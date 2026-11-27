package practice;


import java.util.*;

public class Practice {
    public static void main(String[] args) {
       /*
        int n=123;


        int reverse=0;

        while(n>0){
            int digit=n%10;

            reverse=reverse*10+digit;

            n=n/10;
        }
        System.out.println(reverse);

        int m=153;

        int temp=n;

        int sum=0;
        while(n>0){
            int digit=n%10;

            sum=sum+(digit*digit*digit);

            n=n/10;
        }

        if(sum==temp) System.out.println("amstring number");
        else{
            System.out.println("No");
        }


        int n=5;
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        System.out.println(sum);




        int n=10;
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }


        int n=6;

        int sum=0;
        while(n>0){
            int digit=n%10;

            sum+=digit;

            n=n/10;
        }
        if(sum==n) {
            System.out.println("yes");
        }



        String n="Shahid";



      String rev=new StringBuilder(n).reverse().toString();

        System.out.println(rev);



        String n = "EAAEHJKLIUYGVBNN FUOEJHFIUHUXWNHHE";
        String m=n.replace(" ","");

        char ch[] = m.toCharArray();
        int count = 0;
        int countt = 0;
        for (int ans : ch) {
            if (ans == 'A' | ans == 'E' | ans == 'I' | ans == 'O' | ans == 'U') {
                count++;
            } else {
                countt++;
            }
        }
        System.out.println(count);
        System.out.println(countt);
    }
    }



        String s="MADAM";

        int left=0;
        int right=s.length()-1;

        boolean flag=true;

        while(left<right) {
            if (s.charAt(left) != s.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }

            if(flag){
                System.out.println("Pl");
            }else{
                System.out.println("no");
            }


        HashMap<Character,Integer> map=new HashMap<>();
        String s="djsnflnxiojmeofdeiu";

        char sh[]=s.toCharArray();

        for(char ans:sh){
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
        System.out.print(map);
        HashSet<Character> set=new HashSet<>();
        for(char f:sh){
            if(map.get(f)==1){
                set.add(f);
                break;
            }
        }
        System.out.print("Repeated Chars "+set);


        String k="race";
        String t="carrr";

        char t1[]=k.toCharArray();
        char t2[]=t.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(t2);

        if(Arrays.equals(t1,t2)){
            System.out.println("this are the ana");
        }

        else{System.out.println("nooooooooooooooo");}


        */

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);






        }
    }
