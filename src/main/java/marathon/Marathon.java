package marathon;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class Marathon {
    public static void main (String[]args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] time = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        TreeMap combinedResults = new TreeMap();
        for (int i = 0; i < names.length; i++) {
            combinedResults.put(time[i], names[i]);}

                System.out.println(combinedResults);



        }
    }