import java.util.*;
import java.io.*;
import java.lang.*;
class leader
{ 
    

    static void leaders(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		boolean flag = false;

    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[i] <= arr[j])
    			{
    				flag = true;
    				break;
    			}
    		}

    		if(flag == false)
    		{
    			System.out.print(arr[i]+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 
}
 // above approach has a time complexity of o(n^2).
 /**
  * efficient approach
  import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static void leaders(int arr[], int n)
    {
    	int curr_ldr = arr[n - 1];

    	System.out.print(curr_ldr+" ");

    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curr_ldr < arr[i])
    		{
    			curr_ldr = arr[i];

    			System.out.print(curr_ldr+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 

}
  */