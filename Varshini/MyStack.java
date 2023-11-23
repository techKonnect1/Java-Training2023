import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack s = new Stack();
        MyStack stack = new MyStack();

        s.push(10);
        s.push(22);
        s.push(3);
        s.push(40);

        System.out.println(s.push(60));
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);

    }

}