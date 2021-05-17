//longest common span with same sum in binary array
import java.io.*;
import java.util.*;
import java.lang.*;
// public class longestSpan{
//     int maxCommon(int arr1[],int arr2[],int n)
// {
//     int res=0;
//     for(int i=0;i<n;i++)
//     {
//         int sum1=0,sum2=0;
//         for(int j=i;j<n;j++)
//         {
//             sum1+=arr1[j];
//             sum2+=arr2[j];
//             if(sum1==sum2)
//                 res=Math.max(res,j-i+1);
//         }
//     }
//     return res;
// }
// }

// Java program to find largest subarray 
// with equal number of 0's and 1's. 
class longestSpan{

    // Returns largest common subarray with equal
    // number of 0s and 1s
    static int longestCommonSum(int[] arr1, int[] arr2, int n) {
        // Find difference between the two
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = arr1[i] - arr2[i];

        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<>();

        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result

        // Traverse through the given array
        for (int i = 0; i < n; i++) {
            // Add current element to sum
            sum += arr[i];

            // To handle sum=0 at last index
            if (sum == 0)
                max_len = i + 1;

            // If this sum is seen before,
            // then update max_len if required
            if (hM.containsKey(sum))
                max_len = Math.max(max_len, i - hM.get(sum));

            else // Else put this sum in hash table
                hM.put(sum, i);
        }
        return max_len;
    }

    // Driver code
    public static void main(String args[]) {
        int[] arr1 = { 0, 1, 0, 1, 1, 1, 1 };
        int[] arr2 = { 1, 1, 1, 1, 1, 0, 1 };
        int n = arr1.length;
        System.out.println(longestCommonSum(arr1, arr2, n));
    }
}
