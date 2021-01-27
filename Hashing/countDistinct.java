import java.util.*;
import java.io.*;
import java.lang.*;

class countDistinct
{
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        System.out.println(Distinct(arr, n));
    }
    
    static int Distinct(int arr[], int n)
    {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < n; i++)
          hs.add(arr[i]);
        
        //Set<Integer> hs=new HashSet<Integer>(Arrays.asList(arr));
        //Arrays.asList requires you to take the argument(here, arr) in data type as the wrapper classes.
       return hs.size();        
    }
}