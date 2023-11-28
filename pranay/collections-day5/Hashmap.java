import java.util.HashMap;

public class Hashmap<S> { //define Hashmap class
    public static HashMap<String, String> Setoperations() {
        HashMap<String, String> capitals = new HashMap();

        capitals.put("india", "delhi");//add countries
        capitals.put("Afghanistan", "kabul");
        capitals.put("Bangladesh", "dhaka");
        capitals.put("Canada", "ottawa");
        capitals.put("China", "Beijing");

        String countryfind = "Germany";//find country
        if (capitals.containsKey(countryfind)) {
            String capital = capitals.get(countryfind);
            System.out.println(countryfind + capital);
        }else {
            System.out.println("country not in list");
        }

        capitals.remove("China", "Beijing");//remove country


        return capitals;
    }

}


