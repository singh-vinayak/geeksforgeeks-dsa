//using binary search o(log n) time complexity
import java.util.*;
import java.io.*;
import java.lang.*;

class peak {

    static int getPeak(int arr[], int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
                return mid;
            if (mid > 0 && arr[mid - 1] >= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 1,2,3}, n = 3;

        System.out.println(getPeak(arr, n));

    }

}
//naive approach
/**
 * import java.util.*; import java.io.*; import java.lang.*;
 * 
 * 
 * 
 * class GFG {
 * 
 * static int getPeak(int arr[], int n) { if(n == 1) return arr[0]; if(arr[0] >=
 * arr[1]) return arr[0]; if(arr[n - 1] >= arr[n - 2]) return arr[n - 1];
 * 
 * for(int i = 1; i < n - 1; i++) if(arr[i] >= arr[i - 1] && arr[i] <= arr[i +
 * 1]) return arr[i];
 * 
 * return -1; }
 * 
 * public static void main(String args[]) {
 * 
 * int arr[] = {10, 7, 8, 20, 12}, n = 5;
 * 
 * System.out.println(getPeak(arr, n));
 * 
 * }
 * 
 * }
 */