import java.util.HashSet;// Import the HashSet class
import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("David");
        uniqueNames.add("Ram");
        uniqueNames.add("Jessy");
        uniqueNames.add("Rob");
        uniqueNames.add("Mathew");
        //Add a duplicate name
        uniqueNames.add("Ram");
        //Remove one name
        uniqueNames.remove("David");
        System.out.println("HashSet Contents: " + uniqueNames);
        System.out.println("Updated HashSet: " + uniqueNames);


    ArrayList<Integer> numbers = new ArrayList<>();
    //Add at least 5 random integers to the ArrayList
     numbers.add(1);
     numbers.add(3);
     numbers.add(8);
     numbers.add(10);
     numbers.add(15);
     //Print the contents of the ArrayList
    System.out.println("ArrayList content: " + numbers);
    //Insert a new integer
        numbers.add(0,10);
     //Print the updated ArrayList
    System.out.println("Updated ArrayList: " + numbers);
    //Check if a specific integer exists in the ArrayList
    int searchNumber = 1;
            System.out.println(numbers.contains(1));
      //Sort the ArrayList in ascending order
    Collections.sort(numbers);
    System.out.println("Sorted ArrayList: " + numbers);


    HashMap <String, String> countrycapital = new HashMap<>();
    countrycapital.put("France","Paris");
    countrycapital.put("Colmbia","Bogota");
    countrycapital.put("Germany","Berlin");
    countrycapital.put("India","New Delhi");

    System.out.println("HashMap Contents: " + countrycapital);
    String searchcountry = "India";
            if (countrycapital.containsKey(searchcountry)) {
        String capital = countrycapital.get(searchcountry);
        System.out.println(searchcountry + capital);
    }else {
        System.out.println("country not in list");
    }

        countrycapital.remove("France", "Paris");//remove country
      System.out.println("Updated HashMap: " + countrycapital);


    }
}

