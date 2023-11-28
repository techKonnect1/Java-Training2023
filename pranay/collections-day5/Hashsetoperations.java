

import java.util.HashSet;
public class Hashsetoperations {
    public static HashSet<String>Setoperations() {

        HashSet<String> names = new HashSet<>();
        //add names
        names.add ("sunny");
        names.add ("pranay");
        names.add ("rakessh");
        names.add ("rahhul");
        names.add ("suresh");
        //duplicate name
        names.add ("suresh");
        //remove a name
        names.remove ("sunny");

        return names;

    }
}
