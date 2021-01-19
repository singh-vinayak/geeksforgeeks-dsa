//sort the array with 2 types of elements.
//separate positive and negative elements.
//efficient code based on Hoare's partition methon
import java.util.*;
import java.lang.*;
import java.io.*;

class sort2typeQ1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 13, -12, 18, -10 };

        int n = arr.length;

        sort(arr, n);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void sort(int arr[], int n) {
        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] >= 0);
            if (i >= j)
                return;

            // swapping arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
// naive code with o(n*log n) time and o(n) space complexty
/**
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{13,-12,18,-10};
        
        int n = arr.length;
        
        sort(arr,n);
	
	    for(int x:arr)
            System.out.print(x+" ");
        
    }
    
    static void sort(int arr[],int n){
        int[] temp=new int[n];int i=0;
        
        for(int j=0;j<n;j++)
            if(arr[j]<0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            if(arr[j]>=0)
                temp[i++]=arr[j];
        for(int j=0;j<n;j++)
            arr[j]=temp[j];
    }
}
*/