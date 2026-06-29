package arrays;

public class PassByValAndRef {
    public static void main(String[] args) {
        int arr[]={23, 345,45, 54,45,50};
        int n=20;
        new PassByValAndRef().foo(n,arr);
        System.out.println(n);
        System.out.println(arr[0]);
    }
    void foo(int n,int arr[]){
        n=100;
        arr[0]=-1;
    }
}
