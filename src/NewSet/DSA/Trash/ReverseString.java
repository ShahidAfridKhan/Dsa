package NewSet.DSA.Trash;

public class ReverseString {

    public static void main(String[] args) {
        String n="Shahid";

        char arr[]=n.toCharArray();

        int left=0;
        int right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        StringBuilder sb=new StringBuilder();

        for(char a:arr){
            sb.append(a);
        }

        System.out.println(sb);


    }
}
