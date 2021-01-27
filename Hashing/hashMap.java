// Java program to illustrate 
// Java.util.HashMap 

import java.util.HashMap;
import java.util.Map;

public class hashMap{
    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> m = new HashMap<>();

        // Add elements to the map
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        // Print size and content
        System.out.println(m);
        System.out.println(m.size());

        // Iterating over HashMap using iterators
        for (Map.Entry<String, Integer> e : m.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        
        if (m.containsKey("ide"))   //checks if the map contains specified key or not
            System.out.println("Yes");
        else
            System.out.println("No");

        // Remove key "ide"
        // and returns the associated value 15
        m.remove("ide");        //returns the value associated with the key removed
        System.out.println(m.size());

        m.put("ide",15);
        if (m.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Get value corresponding to passed key
        // <"ide", 15>
        System.out.println(m.get("ide"));

        // The given key is absent
        System.out.println(m.get("practice"));
    }
}
