//count swaps made to sort the array using cycle sort
import java.util.*;
import java.lang.*;
import java.io.*;

class countSwaps{
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 4, 6, 8 };
        int n = arr.length;
        cycleSortDistinct(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    static void cycleSortDistinct(int arr[], int n) {
        int count=0;
        for (int cs = 0; cs < n - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;
            // swap(item,arr[pos])
            if(item!=arr[pos])
                count++;
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++)
                    if (arr[i] < item)
                        pos++;
                if (item != arr[pos])
                    count++;
                // swap(item,arr[pos])
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
        System.out.println("number of swaps= "+count);
    }
}
