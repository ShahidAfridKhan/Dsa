package OldSet.OOPS.Queue;

public class QueueToStack {

    int start=-1;
    int end=-1;
    int currentsize=0;
    int size=3;
    int stack[]=new int[size];
    void push(int val){
        if(currentsize==size){
            System.out.println("No space");
            return;
        }else if(currentsize==0){
            start=end=0;
        }else{
            end=(end+1)%size;
        }
        System.out.println("Pushed "+val);
        stack[end]=val;
        currentsize++;
    }
    void pop(){

    }
    void peek(){

    }

    public static void main(String[] args) {
        QueueToStack st=new QueueToStack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
    }
}
