//create partitions based on a pivot
//such that all elements smaller than the
//element at the specified position are before that element
//and larger elements are after the element
import java.util.*;
import java.lang.*;
import java.io.*;

class naivePartition{
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 13, 6, 9, 12, 11, 8 };

        int n = arr.length;
        partition(arr, 0, n - 1, n - 1);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void partition(int arr[], int l, int h, int p) {
        int[] temp = new int[h - l + 1];
        int index = 0;
        for (int i = l; i <= h; i++)
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        for (int i = l; i <= h; i++)
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        for (int i = l; i <= h; i++)
            arr[i] = temp[i - l];
    }
}
//o(n)-both time and space complexity with 3 traversals of the array.