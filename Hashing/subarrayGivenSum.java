
//find a subarray with sum equal to zero
import java.util.*;
import java.lang.*;
import java.io.*;

class subarrayGivenSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 8, 6, 13, 3, -1};
        int n = arr.length;
        int sum=22;
        System.out.println(ZeroSumSubarray(arr, n,sum));

    }

    static int ZeroSumSubarray(int arr[], int n,int X) {
        Set<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        for (int i = 0; i < n; i++) {
            if(prefix_sum==X)
                return 1;
            prefix_sum += arr[i];
            if (us.contains(prefix_sum-X) == true)
                return 1;

            us.add(prefix_sum);
        }

        return 0;
    }
}
