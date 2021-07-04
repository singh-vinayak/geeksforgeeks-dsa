//print the k largest elements
//using min heap- o(k + (n-k)log k)
import java.io.*;
import java.util.*;

class kLargestElements {

    public static void firstKElements(int arr[], int n, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (minHeap.peek() > arr[i])
                continue;
            else {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        Iterator iterator = minHeap.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };

        int size = arr.length;

        int k = 3;

        firstKElements(arr, size, k);
    }
}


//using max heap- o(n +k * log k)