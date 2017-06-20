package net.kidpluto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chris on 3/20/2017.
 *
 * Phone book, using HashMap
 *
 */
public class Day08of30 {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Jo Smith", 12345678);
        hm.put("Joe Smith", 98765432);
        hm.put("Jane Smith", 12345689);
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        String name = "Jo Smith Jo";
        if (hm.get(name)!=null) {
            System.out.println(hm.get(name));
        }
        else {
            System.out.println("Not found.");
        }
    }
}
