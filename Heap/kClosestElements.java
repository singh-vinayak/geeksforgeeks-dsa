//print k closest elements
//to a given element in an array
//naive - o(n^2) time, o(n) space complexity
import java.io.*;
import java.util.*;

class kClosestElements {

    public static void printKClosest(int arr[], int n, int k, int x) {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < k; i++) {

            int min_diff = Integer.MAX_VALUE;
            int min_diff_idx = 0;

            for (int j = 0; j < n; j++) {
                if (visited[j] == false && Math.abs(arr[j] - x) <= min_diff) {
                    min_diff = Math.abs(arr[j] - x);
                    min_diff_idx = j;
                }
            }
            System.out.print(arr[min_diff_idx] + " ");
            visited[min_diff_idx] = true;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 5, 40, 38, 80, 70 };

        int size = arr.length;

        int x = 35;
        int k = 3;

        printKClosest(arr, size, k, x);
    }
}

//efficient approach- o(n), o(n)

// import java.io.*;
// import java.util.*;

// class Pair {
//     Integer key;
//     Integer value;

//     public Pair(Integer key, Integer value) {
//         this.key = key;
//         this.value = value;
//     }

//     public Integer getKey() {
//         return key;
//     }

//     public void setKey(Integer key) {
//         this.key = key;
//     }

//     public Integer getValue() {
//         return value;
//     }

//     public void setValue(Integer value) {
//         this.value = value;
//     }
// }

// class GFG {

//     public static void printKClosest(int arr[], int n, int k, int x) {
//         PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
//             public int compare(Pair p1, Pair p2) {
//                 return p2.getValue().compareTo(p1.getValue());
//             }
//         });

//         for (int i = 0; i < k; i++) {
//             pq.offer(new Pair(arr[i], Math.abs(arr[i] - x)));
//         }

//         for (int i = k; i < n; i++) {
//             int diff = Math.abs(arr[i] - x);

//             if (pq.peek().getValue() > diff) {
//                 pq.poll();
//                 pq.offer(new Pair(arr[i], diff));
//             }
//         }

//         while (!pq.isEmpty()) {
//             System.out.print(pq.poll().getKey() + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 10, 30, 5, 40, 38, 80, 70 };

//         int size = arr.length;

//         int x = 35;
//         int k = 3;

//         printKClosest(arr, size, k, x);
//     }
// }
