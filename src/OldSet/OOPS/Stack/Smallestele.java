package OldSet.OOPS.Stack;

public class Smallestele {
    int max = 5;
    int stack[] = new int[max];
    int minstack[]=new int[max];
    int top = -1;
    int mintop=-1;

    void push(int val) {
        if (top == stack.length - 1) {
            System.out.println("No extra space");
        } else {
            stack[++top] = val;

            if(mintop==-1 || val<=minstack[mintop]){
                minstack[++mintop]=val;
            }
            System.out.println("pushed "+val);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("OldSet.OOPS.Stack is empty");
        } else {
            int removed=stack[top--];
            System.out.println("Removed: " + removed);
            if(removed==minstack[mintop]) {
                mintop--;
            }
        }
    }

    void getmin(){
        if(mintop==-1){
            System.out.println("OldSet.OOPS.Stack is empty");
        }else{
            System.out.println(minstack[mintop]);
        }
    }

    public static void main(String[] args) {

        Smallestele s = new Smallestele();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();


        s.getmin();// This will show stack is empty
    }
}