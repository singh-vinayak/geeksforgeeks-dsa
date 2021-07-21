///get the longest  increasing subsequence in an array

import java.io.*;
import java.util.*;
import static java.lang.System.out;

class getLIS {

    static int LIS(int arr[], int n) {
        int lis[] = new int[n];

        lis[0] = 1;

        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j])
                    lis[i] = Math.max(lis[i], lis[j] + 1);
        }

        int res = lis[0];

        for (int i = 0; i < n; i++) {
            res = Math.max(lis[i], res);
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 8, 10, 5, 1 };
        int n = 7;

        System.out.println(LIS(arr, n));

    }
}


//n * log n approach below

// static int ceilIdx(int tail[], int l, int r, int key) {
//     while (r > l) {
//         int m = l + (r - l) / 2;
//         if (tail[m] >= key)
//             r = m;
//         else
//             l = m + 1;
//     }

//     return r;
// }

// static int LIS(int arr[], int n) 
//     { 
     
  
//         int[] tail = new int[n]; 
//         int len =1; 
  
//         tail[0] = arr[0]; 
        
//         for (int i = 1; i < n; i++) {
            
//             if(arr[i] > tail[len - 1])
//             {
//                 tail[len] = arr[i];
//                 len++;
//             }
//             else{
//                 int c = ceilIdx(tail, 0, len - 1, arr[i]);
                
//                 tail[c] = arr[i];
//             }
//         } 
  
//         return len; 
//     }