import java.util.*;
import java.io.*;
import java.lang.*;

class longestsubArrayEqual1s0s {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 1, 0, 1, 0, 1, 1, 1 };
        int len = arr.length;

        System.out.println(largestZeroSubarray(arr, len));
    }

    static int largestZeroSubarray(int arr[], int n) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                maxLen = i + 1;

            if (hm.containsKey(sum + n) == true) {
                if (maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);

            } else
                hm.put(sum + n, i);
        }
        return maxLen;
    }
}

//naive approach
/**
 * 
int longestSub(int arr[],int n,int sum)
{
    int res=0;
    for(int i=0;i<n;i++)
    {
        int c0=0;int c1=0;
        for(int j=i;i<n;j++)
        {
            if(a[j]==0)
                c0++;
            else
                c1++;
            if(c1==c0)
                res=Math.max(res,c1+c0);
        }
    }
    return res;
}
 * 
 */