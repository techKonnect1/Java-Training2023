import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static ArrayList<Integer> ListOperations() {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add (2);//add numbers
        numbers.add (5);
        numbers.add (1);
        numbers.add (10);
        numbers.add (8);
        numbers.add (0,20);// at begining of list

        Collections.sort(numbers);//sort numbers
        for (int i: numbers) {
            System.out.println(i);
        }
        //search number 10
        int searchnumber = 10;
        boolean containsinteger = numbers.contains(searchnumber);
        System.out.println("number in Arraylist: " + containsinteger);


        return numbers;

    }

    }
