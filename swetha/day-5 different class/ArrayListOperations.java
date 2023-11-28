import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static ArrayList<Integer> performListOperations() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(10);
        numbers.add(0, 25); // Adding at the beginning
        Collections.sort(numbers); // Sorting

        return numbers;
    }
}
