import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        // Part 1: Set Operations using HashSet
        HashSet<String> names = HashSetOperations.performSetOperations();
        System.out.println("HashSet after operations: " + names);

        // Part 2: List Operations using ArrayList
        ArrayList<Integer> numbers = ArrayListOperations.performListOperations();
        System.out.println("ArrayList after operations: " + numbers);

        // Part 3: HashMap Operations
        HashMap<String, String> countryCapitals = HashMapOperations.performHashMapOperations();
        System.out.println("HashMap after operations: " + countryCapitals);
    }
}
