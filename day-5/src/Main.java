// Import the HashSet class
import java.util.HashSet;// Import the HashSet class
import java.util.ArrayList;// Import the ArrayList class
import java.util.Collections;// Import Collections class
import java.util.HashMap;//Import the Hashmap class

public class Main {
    public static void main(String[] args) {
        //part 1 : set operatins using Hashset
        //using hashset to store a collection of names
        HashSet<String> names = new HashSet<String>();
        //adding names
        names.add("swetha");
        names.add("akash");
        names.add("rama");
        names.add("benjamin");
        names.add("leo");
        //adding duplicate names
        names.add("leo");
        names.add("benjamin");
        //remove names
        names.remove("benjamin");
        System.out.println(names);


       // int numbers;
        //numbers.add(25);
       // System.out.println("numbers after adding" + numbers);
        //part 2: List Operations (Using ArrayList):
        //creating an arraylist to numbers class
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //adding numbers
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(10);
       // for (int i : numbers) {
            //System.out.println(i);
        //}
        //printing numbers
        System.out.println(numbers);
        // adding number before list
        numbers.add(25);
        System.out.println("numbers adding at begining of the list" + numbers);
        //sort numbers
        Collections.sort(numbers);  // Sort cars
        for (int i : numbers) {
            System.out.println(i);
        }

        //finding a specific integer in the array list
        int searchinteger = 25; // find this integer
        boolean containsinteger = numbers.contains(searchinteger);
        System.out.println("ArrayList contains " + searchinteger + ": " + containsinteger);



// part 3: HashMap Operations:

        HashMap<String, String> countrycapitals = new HashMap<String, String>();//create a Hashmap object countrycapitals

        // Add keys and values (Country, City)
        countrycapitals.put("INDIA", "Delhi");
        countrycapitals.put("England", "London");
        countrycapitals.put("Germany", "Berlin");
        countrycapitals.put("Norway", "Oslo");
        countrycapitals.put("USA", "Washington DC");
        System.out.println(countrycapitals);//print countrycapitals

        //Check if a specific country is in the HashMap and print its capital.
        String countrysearch = "Canada"; // Change this to the country you want to check
        if (countrycapitals.containsKey(countrysearch)) {
            String capital = countrycapitals.get(countrysearch);
            System.out.println(countrysearch + "'s capital is " + capital);
        } else {
            System.out.println("Country not found in the HashMap.");
        }

        //Remove one country from the HashMap.
        countrycapitals.remove("USA", "Washington DC");
        System.out.println(countrycapitals);



    }
}