
import java.util.HashSet;

public class HashSetOperations {
    public static HashSet<String> performSetOperations() {
        HashSet<String> names = new HashSet<String>();

        names.add("swetha");
        names.add("akash");
        names.add("rama");
        names.add("benjamin");
        names.add("leo");
        names.add("leo"); // Adding duplicate
        names.add("benjamin"); // Adding duplicate
        names.remove("benjamin"); // Removing element

        return names;
    }
}










