//dutch national flag algo.
//sort an array of 0s,1s and 2s
//time- o(n) , space- o(1)
import java.util.*;
import java.lang.*;
import java.io.*;

class sort3typeQ1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 1, 2, 0, 1, 1, 2 };

        int n = arr.length;

        sort(arr, n);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void sort(int arr[], int n) {
        int l = 0, h = n - 1, mid = 0;
        while (mid <= h) {
            switch (arr[mid]) {
                case 0:
                    // swapping arr[l] & arr[mid])
                    int temp = arr[l];
                    arr[l] = arr[mid];
                    arr[mid] = temp;

                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // swapping arr[h] & arr[mid])
                    temp = arr[h];
                    arr[h] = arr[mid];
                    arr[mid] = temp;

                    h--;
                    break;
            }
        }

    }
}

//naive below
//o(n), 4 traversals and o(n) auxillary space

/**
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 1, 2, 0, 1, 1, 2 };

        int n = arr.length;

        sort(arr, n);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void sort(int arr[], int n) {
        int[] temp = new int[n];
        int i = 0;

        for (int j = 0; j < n; j++)
            if (arr[j] == 0)
                temp[i++] = arr[j];
        for (int j = 0; j < n; j++)
            if (arr[j] == 1)
                temp[i++] = arr[j];
        for (int k = 0; k < n; k++)
            if (arr[k] == 2)
                temp[i++] = arr[k];
        for (int j = 0; j < n; j++)
            arr[j] = temp[j];
    }
}
*/