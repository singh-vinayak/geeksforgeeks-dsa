//naive solution
import java.util.*;
import java.io.*;
import java.lang.*;

class equivalentPoint {

    static boolean checkEquilibrium(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int l_sum = 0, r_sum = 0;

            for (int j = 0; j < i; j++)
                l_sum += arr[j];

            for (int j = i + 1; j < n; j++)
                r_sum += arr[j];

            if (l_sum == r_sum)
                return true;
        }

        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 8, -9, 20, 6 }, n = 6;

        System.out.println(checkEquilibrium(arr, n));

    }

}
//efficient solution
/**
 * 
 * import java.util.*; import java.io.*; import java.lang.*; class GFG {
 * 
 * 
 * static boolean checkEquilibrium(int arr[], int n) { int sum = 0;
 * 
 * for(int i = 0; i < n; i++) { sum += arr[i]; }
 * 
 * int l_sum = 0;
 * 
 * for(int i = 0; i < n; i++) { if(l_sum == sum - arr[i]) return true;
 * 
 * l_sum += arr[i];
 * 
 * sum -= arr[i]; }
 * 
 * return false; } public static void main(String args[]) { int arr[] = {3, 4,
 * 8, -9, 20, 6}, n = 6;
 * 
 * System.out.println(checkEquilibrium(arr, n));
 * 
 * }
 * 
 * }
 * 
 */