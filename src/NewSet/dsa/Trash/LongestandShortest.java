package NewSet.dsa.Trash;

import java.util.Arrays;

public class LongestandShortest {
    static String ret(String names[]){
        String result = "";
        for (String s : names) {
            result = result + s + " " + s.length() + ", ";
        }
        return result.trim().replaceAll(",$","");
    }
    static String ret1(String names[]){
        String Longest=names[0];
        String Shortest=names[0];

        for(int i=0;i<names.length;i++){
            if(names[i].length()>Longest.length()){
                Longest=names[i];
            }
            if(names[i].length()<Shortest.length()){
                Shortest=names[i];
            }
        }
        return "Longest: "+Longest+" "+"Shortest: "+Shortest;
    }
    static String ret2(String names[]){
        String result="";

        for(int i=0;i<names.length;i++){
            char ch[]=names[i].toLowerCase().toCharArray();

            int count=0;
            for(char c:ch){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
            result+=count+",";
        }
        return result.trim().replaceAll(",$","");
    }
    static String ret3(String names[]){
        String result="";

        for(String n:names){
            result+=n;
        }
        return result+" "+result.length();
    }
    static String ret4(String names[]){

        for(int i=0;i<names.length;i++){
            String rev="";

            for(int j=names[i].length()-1;j>=0;j--){
                rev+=names[i].charAt(j);
            }
            names[i]=rev;
        }
        return Arrays.toString(names);
    }
    static String ret5(){
        String a="care";
        String b="race";
//        a=a.toLowerCase();
//        b=b.toLowerCase();

        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return "this are equal";
        }
        return "Not Equal";
    }
    static String ret6(String names[]){
        for(int i=0;i<names.length;i++){
            String rev="";
            char arr[]=names[i].toCharArray();

            for(int j=names[i].length()-1;j>=0;j--){
                rev+=names[i].charAt(j);
            }
            names[i]=rev;
        }
        return Arrays.toString(names);
    }

    static String ret7(String names[]){
        int left=0;
        int right=names.length-1;
        while(left<right){
            String temp=names[left];
            names[left]=names[right];
            names[right]=temp;

            left++;
            right--;
        }
        return Arrays.toString(names);
    }

    public static void main(String[] args) {
        String names[]={"Shahid","Afrid","Khan"};

        System.out.println(ret7(names));

    }
}
