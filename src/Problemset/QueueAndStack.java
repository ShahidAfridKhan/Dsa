package Problemset;

public class QueueAndStack {
    int size=3;
    int stack[]=new int[size];
    int top=-1;

    void Sp(int val){
        if(top==size-1){
            System.out.println("No S");
        }else{
            stack[++top]=val;
            System.out.println("Pushed "+val);
        }
    }

    void Stackpop(){
        if(top==-1){
            System.out.println("No way");
        }else{
            System.out.println("POP "+stack[top--]);
        }
    }

    int start=-1;
    int end=-1;
    int currentcount=0;
    int Queue[]=new int[size];

    void Qp(int val){
        if(currentcount==size){
            System.out.println("No space");
        }else if(currentcount==0){
            start=end=0;
        }else{
            end=(end+1)%size;
        }
        Queue[end]=val;

        System.out.println("pushed "+val);
    }

    void Queuepop(){
        if(currentcount==0){
            System.out.println("No way");
        }

        System.out.println("pop");

        if(currentcount==1){
            start=end=-1;
        }else{
            start=(start+1)%size;
        }
        currentcount--;
    }
    public static void main(String[] args) {
        QueueAndStack QS=new QueueAndStack();

        QS.Qp(2);
        QS.Queuepop();
    }
}
