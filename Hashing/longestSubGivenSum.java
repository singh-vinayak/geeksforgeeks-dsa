//prorgram to find the longest sub-array with given sum

import java.util.*;
import java.lang.*;
import java.io.*;

class longestSubGivenSum {
    public static void main(String[] args) {
        int arr[] = new int[] { 8, 3, -7, -4, 1 };
        int n = arr.length;
        int sum = -8;

        System.out.println(largestSubarrayWithSumX(arr, n, sum));

    }

    static int largestSubarrayWithSumX(int arr[], int n, int sum) {
        int pre_sum=0,res=0;
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            pre_sum+=arr[i];
            if(pre_sum==sum)
                res=i+1;
            if(m.containsKey(pre_sum)==false)
                m.put(pre_sum, i);
            if(m.containsKey(pre_sum-sum))
                res=Math.max(res, i-m.get(pre_sum-sum));
        }
        return res;
    }
}
