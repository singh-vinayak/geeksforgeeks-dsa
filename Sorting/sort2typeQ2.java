//sort array of 2 elements.
//separate odd and even elements
import java.util.*;
import java.lang.*;
import java.io.*;

class sort2typeQ2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 13, 14, 17, 10,5,6,9,33 };

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
            } while (arr[i] %2!= 0);
            do {
                j--;
            } while (arr[j] %2== 0);
            if (i >= j)
                return;

            // swapping arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
