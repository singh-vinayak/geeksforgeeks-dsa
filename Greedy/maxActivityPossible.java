//print the maximum number of activities possible
//out of given items
//condition- they should not clash
//that is, next activity should not start before the end of previous one
import java.util.*;
import java.io.*;
import java.lang.*;

class Activity implements Comparable<Activity>
{
	int start;
	int finish;

	Activity(int s, int f)
	{
		start = s;
		finish = f;
	}

	public int compareTo(Activity a1) {
		return finish - a1.finish;
	}
}

class MyCmp implements Comparator<Activity>
{
	public int compare(Activity a1, Activity a2)
	{
		return a1.finish - a2.finish;
	}
}

class maxActivityPossible 
{ 

    static int maxActivity(Activity arr[], int n)
    {	
	    Arrays.sort(arr);
		//Arrays.sort(arr, new MyCmp());

	    int res = 1;
	    int prev = 0;

	    for(int curr = 1; curr < n; curr++)
	    {
	       
	    	if(arr[curr].start >= arr[prev].finish)
	    	{
	    		res++;

	    		prev = curr;
	    	}
	    }

	    return res;
    }

    public static void main(String args[]) 
    {
    	Activity arr[] = {new Activity(12, 25), 
    					  new Activity(10, 20), 
    					  new Activity(20, 30)};
    	int n = 3;

        System.out.println(maxActivity(arr, n));

    } 

}