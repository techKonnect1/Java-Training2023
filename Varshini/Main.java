public class Main {
        public static void main(String[] args) {
            if(new StringBuilder("example").reverse().toString().equals(reverseString("example"))){
                System.out.println("Reverse of string successful");
            } else{
                System.out.println("Reverse of string failed");
            }

        }
        public static String reverseString(String input){
            //Write code to reverse the given "input" string.
            StringBuilder reversed = new StringBuilder();
            for (int i = input.length() -1; i >= 0; i--){
                reversed.append(input.charAt(i));
            }

            return reversed.toString();
        }

}
