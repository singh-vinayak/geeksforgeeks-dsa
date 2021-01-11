//o(n) time complexity and o(n) space complexity
import java.util.*;
import java.io.*;
import java.lang.*;

class repeatingEle {

    static int repeat(int arr[], int n) {
        boolean visit[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visit[arr[i]])
                return arr[i];
            visit[arr[i]] = true;
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 0, 2, 1, 3, 2, 2 }, n = 6;

        System.out.println(repeat(arr, n));

    }

}
//o(n) time complexity o(1) space complexity
/**
 * import java.util.*; import java.io.*; import java.lang.*;
 * 
 * 
 * 
 * class GFG {
 * 
 * static int repeat(int arr[], int n) { int slow = arr[0], fast = arr[0];
 * 
 * do{ slow = arr[slow]; fast = arr[arr[fast]];
 * 
 * }while(slow != fast);
 * 
 * slow = arr[0];
 * 
 * while(slow != fast) { slow = arr[slow]; fast = arr[fast]; } return slow; }
 * 
 * public static void main(String args[]) {
 * 
 * int arr[] = {1, 3, 2, 4, 6, 5, 7, 3}, n= 8;
 * 
 * System.out.println(repeat(arr, n));
 * 
 * }
 * 
 * }
 */