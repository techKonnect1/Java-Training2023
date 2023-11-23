import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("swetha");
        names.push("sravani");
        names.push("ben");
        names.push("leo");
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.peek());
    }
}
