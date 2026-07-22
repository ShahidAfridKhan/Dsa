package Cognizant;

public class P1 {
    public static void main(String[] args) {
        String n="Shahid";

        char arr[]=n.toCharArray();

        char left=0,right=arr.length-1;

        while(left<right){
            String temp=arr[left];
            arr[left]=arr[right];

        }
    }
}
