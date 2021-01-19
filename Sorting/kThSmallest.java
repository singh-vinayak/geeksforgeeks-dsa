//naive is o(n*log n) time complexity with a probable o(n) space complexity if we can't modify the original array.

/**


import java.util.*;
import java.lang.*;
import java.io.*;

class kThSmallest{
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 5, 30, 12 };

        int n = arr.length;
        int k = 2;

        System.out.print(kthSmallest(arr, n, k));

    }

    static int kthSmallest(int arr[], int n, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}

*/

//using Lomuto Partition (which on average becomes linear)
import java.util.*;
import java.lang.*;
import java.io.*;

class kThSmallest {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 4, 5, 8, 11, 6, 26 };

        int n = arr.length;
        int k = 5;
        int index = kthSmallest(arr, n, k);

        System.out.print(arr[index]);

    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    static int kthSmallest(int arr[], int n, int k) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int p = partition(arr, l, r);
            if (p == k - 1)
                return p;
            else if (p > k - 1)
                r = p - 1;
            else
                l = p + 1;
        }
        return -1;
    }
}
