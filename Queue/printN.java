//given a number n, print the first n numbers in ascending order such that the numbers contain digits in the set predefined.. like {5,6}


import java.util.LinkedList;
import java.util.*;

public class printN {

    static void printFirstN(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("5");
        q.add("6");

        for (int i = 0; i < n; i++) {
            String curr = q.poll();

            System.out.print(curr + " ");

            q.add(curr + "5");
            q.add(curr + "6");
        }

    }

    public static void main(String args[]) {
        int n = 5;

        printFirstN(n);
    }
}
