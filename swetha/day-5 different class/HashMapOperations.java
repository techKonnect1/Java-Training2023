import java.util.HashMap;

public class HashMapOperations {
    public static HashMap<String, String> performHashMapOperations() {
        HashMap<String, String> countryCapitals = new HashMap<String, String>();

        countryCapitals.put("INDIA", "Delhi");
        countryCapitals.put("England", "London");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Norway", "Oslo");
        countryCapitals.put("USA", "Washington DC");

        return countryCapitals;
    }
}
