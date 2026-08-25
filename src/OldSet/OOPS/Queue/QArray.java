package OldSet.OOPS.Queue;

public class QArray {
    int size=3;
    int queue[]=new int[size];
    int start=-1;
    int end=-1;
    int currentsize=0;
     void push(int val){
        if(currentsize==size){
            System.out.println("No space");
            return;
        }else if(currentsize==0){
            start=end=0;
        }else{
            end=(end+1)%size;
        }
        queue[end]=val;
        currentsize++;

        System.out.println("pushed ");
    }

    void pop(){
        if(currentsize==0){
            System.out.println("No Spcae");
            return;
        }
        System.out.println("Removed "+queue[start]);
        if(currentsize==1){
            start=end=-1;
        }else{
            start=(start+1)%size;
        }
        currentsize--;
    }
    public static void main(String[] args) {
        QArray q =new QArray();

        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.pop();
    }
}
