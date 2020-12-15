//efficient solution o(n)
import java.util.*;
import java.io.*;
import java.lang.*;
class maxSubArray
{ 
    

    static int maxSum(int arr[], int n)
    {
    	int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, -2, 3, -1, 2}, n = 5;

       System.out.println(maxSum(arr, n));

    } 

}
//naive solution o(n^2)
/**
 * 
 * import java.util.*; import java.io.*; import java.lang.*; class GFG {
 * 
 * 
 * static int maxSum(int arr[], int n) { int res = arr[0];
 * 
 * for(int i = 0; i < n; i++) { int curr = 0;
 * 
 * for(int j = i; j < n; j++) { curr = curr + arr[j];
 * 
 * res = Math.max(res, curr); } }
 * 
 * return res; }
 * 
 * 
 * public static void main(String args[]) { int arr[] = {1, -2, 3, -1, 2}, n =
 * 5;
 * 
 * System.out.println(maxSum(arr, n));
 * 
 * }
 * 
 * }
 * 
 */