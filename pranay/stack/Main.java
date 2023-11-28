import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<Integer> pranay = new Stack<>();

        pranay.push(1);
        pranay.push(2);
        pranay.push(3);
        pranay.push(4);

        System.out.println(pranay.pop());
        System.out.println(pranay.peek());
        System.out.println(pranay.peek());
        System.out.println(pranay.pop());
        System.out.println(pranay.search(2));
        System.out.println(pranay.search(212121));
        System.out.println(pranay.empty());

    }
}
