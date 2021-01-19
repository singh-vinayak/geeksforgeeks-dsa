//segregate array elements in a binary array

import java.util.*;
import java.lang.*;
import java.io.*;

class sort2typeQ3 {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 0, 1,0,0,1 };

        int n = arr.length;

        sort(arr, n);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void sort(int arr[], int n) {
        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (arr[i] == 0);
            do {
                j--;
            } while (arr[j] ==1);
            if (i >= j)
                return;

            // swapping arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
