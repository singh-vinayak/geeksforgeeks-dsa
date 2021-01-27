import java.util.*;
import java.io.*;
import java.lang.*;

class countFrequency {
    public static void main(String[] args) {
        int arr[] = new int[] { 15, 16, 27, 27, 28, 15 };
        int n = arr.length;

        countFreq(arr, n);
    }

    static void countFreq(int arr[], int n) {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hmp.containsKey(arr[i]) == true)
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
                hmp.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> itr : hmp.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());

        System.out.println("---------------");
        //to get output in order in which elements in array appear
        LinkedHashMap<Integer, Integer> hm=new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hm.containsKey(arr[i]) == true)
                hm.put(arr[i], hm.get(arr[i]) + 1);
            else
                hm.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> itr : hm.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
}