
// Java program to demonstrate TreeSet
import java.util.*;

class TreeSetExample {

    public static void main(String[] args) {

        // Creating an empty TreeSet
        TreeSet<String> s = new TreeSet<String>();

        // Elements are added using add() method
        s.add("gfg");
        s.add("courses");
        s.add("ide");

        // Displaying the TreeSet
        // in sorted order
        System.out.println(s);

        // Checking whether "ide" is present
        // or not
        System.out.println(s.contains("ide"));

        // Iterator to traverse the TreeSet
        Iterator<String> i = s.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        // Creating an empty TreeSet
        TreeSet<Integer> s2 = new TreeSet<Integer>();

        // Elements are added using add() method
        s2.add(10);
        s2.add(5);
        s2.add(2);
        s2.add(15);

        // Removing 5 from TreeSet
        s2.remove(5);

        // foreach way of traversal
        for (Integer x : s2)
            System.out.print(x + " ");

        // Creating an empty TreeSet
        TreeSet<Integer> s3 = new TreeSet<Integer>();

        // Elements are added using add() method
        s3.add(10);
        s3.add(5);
        s3.add(2);
        s3.add(15);

        // Prints the largest value lower than 5
        // Here it is 2
        System.out.println(s3.lower(5));

        // Prints the smallest higher value than 5
        // Between 10 and 15 smallest is 10
        System.out.println(s3.higher(5));

        // Value <= 5
        System.out.println(s3.floor(5));

        // Value >= 5
        System.out.println(s3.ceiling(5));
    }
}
