/*
import java.util.*;

class main {
    public static void main(OldSet.OOPS.String[] args)
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='"'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        OldSet.OOPS.String str=sb.toString();
        OldSet.OOPS.String word[]=str.split(" ");
        int left=0,right=word.length-1;
        while(left<right){
            OldSet.OOPS.String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        for(OldSet.OOPS.String ans:word){
            System.out.print(ans+" ");
        }
    }
}


//"shahdi afrid khan"
//"khan afrid shahdi"

import java.util.*;
class main{
    public static void main(OldSet.OOPS.String[] args) {
        Scanner sc=new Scanner(System.in);
        OldSet.OOPS.String in=sc.nextLine();
        in=in.replace("\"","");
        OldSet.OOPS.String word[]=in.split(" ");
        int left=0;
        int right=word.length-1;
        while(left<right){
            OldSet.OOPS.String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        StringBuilder sb=new StringBuilder();
        sb.append("\"");
        for(int i=0;i<word.length;i++){
            sb.append(word[i]);
            if(i!=word.length-1) sb.append(" ");
        }
        sb.append("\"");
        System.out.println(sb.toString());
    }
}


        OldSet.OOPS.String s = "Hello  "!";
        System.out.println(s);
    }

 
import java.util.*;
class main{
    public static void main(OldSet.OOPS.String[] args) {
        Scanner sc=new Scanner(System.in);
        OldSet.OOPS.String s=sc.nextLine();
        OldSet.OOPS.String word[]=s.split(" ");
        for(int i=0;i<word.length;i++){
            for(int j=0;j<word.length-i-1;j++){
               if(word[j].compareTo(word[j+1]) >0){
                   OldSet.OOPS.String temp=word[j];
                   word[j]=word[j+1];
                   word[j+1]=temp;
               }
            }
        }
        for(OldSet.OOPS.String ans:word){
            System.out.print(ans+" ");
        }
    }
}


import java.util.*;
class main{
    public static void main(OldSet.OOPS.String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        OldSet.OOPS.String s=sb.toString();
        OldSet.OOPS.String word[]=s.split(" ");
        for(int i=0;i<word.length;i++){
            if(sb.charAt(i)=='"'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        for(int i=0;i<word.length;i++){
            for(int j=i+1;j<word.length-1;j++){
                
            }
        }
    }
}


import java.util.*;
class main{
    public static void main(OldSet.OOPS.String[] args) {
        Scanner sc=new Scanner(System.in);
        OldSet.OOPS.String s=sc.nextLine();
        OldSet.OOPS.String word[]=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            if(word[i].length()>0){
                sb.append(word[i]);
                sb.append(" ");
            }
        }
    }



import java.util.*;
class main{
    public static void main(OldSet.OOPS.String[] args) {
        Scanner sc=new Scanner(System.in);
        OldSet.OOPS.String num1=sc.nextLine();
        OldSet.OOPS.String num2=sc.nextLine();
        OldSet.OOPS.String num3=num1+num2;

        System.out.println(num3);
    }
}

 */

