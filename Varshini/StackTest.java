import java.util.Stack;

public class StackTest {

    int[] stk = new int[5];
    int top = -1;
    int capacity;

    public static void main(String[] args) {
        Stack s = new Stack();
        StackTest test = new StackTest();
        MyStack stack = new MyStack();


        s.push(10);
        s.push(22);
        s.push(3);
        s.push(40);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public int MyStackpop() {
        if(MyStackisEmpty())
        {
            System.out.println("stack is empty");
        }

        return stk[top--];
    }

    public boolean MyStackisEmpty() {

        return (top == -1);
    }

    public void MyStackpush(int i) {

        stk[++top] = i;
    }

    public int MyStackpeek() {
        if (MyStackisEmpty()) {

            System.out.println("The element at the top of the" + "stack is: ");
        }
        return stk[top];
    }


    }





