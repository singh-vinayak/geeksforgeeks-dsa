import java.util.*;
import java.io.*;
import java.lang.*;

class firstOccurence {

    static int firstOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x > arr[mid])
                low = mid + 1;

            else if (x < arr[mid])
                high = mid - 1;

            else {
                if (mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;

                else
                    high = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 10, 10, 10, 20 }, n = 5;

        int x = 10;

        System.out.println(firstOcc(arr, n, x));
    }

}
//recursive approach
/**
 * import java.util.*; import java.io.*; import java.lang.*;
 * 
 * 
 * 
 * class GFG {
 * 
 * 
 * 
 * static int firstOcc(int arr[], int low, int high, int x) { if(low > high)
 * return -1;
 * 
 * int mid = (low + high) / 2;
 * 
 * if(x > arr[mid]) return firstOcc(arr, mid + 1, high, x);
 * 
 * else if(x < arr[mid]) return firstOcc(arr, low, mid - 1, x);
 * 
 * else { if(mid == 0 || arr[mid - 1] != arr[mid]) return mid;
 * 
 * else return firstOcc(arr, low, mid - 1, x); } }
 * 
 * public static void main(String args[]) { int arr[] = {5, 10, 10, 15, 20, 20,
 * 20}, n = 7;
 * 
 * int x = 20;
 * 
 * System.out.println(firstOcc(arr, 0, n - 1, x));
 * 
 * 
 * }
 * 
 * }
 */