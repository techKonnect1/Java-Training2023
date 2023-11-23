
public class Main {
    public static void main(String[] args) {
        String input = "example";
        if (new StringBuilder(input).reverse().toString().equals(reverseString(input))) {
            System.out.println("Reverse of string successful");
        } else {
            System.out.println("Reverse of string failed");
        }
    }

    public static String reverseString(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return reversed;
    }
}


