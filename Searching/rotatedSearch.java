//search in a rotated array
import java.util.*;
import java.io.*;
import java.lang.*;



class rotatedSearch 
{ 
	/**
	static int search(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			if(arr[mid] == x)
				return mid;
			if(arr[low] < arr[mid])
			{
				if(x >= arr[low] && x < arr[mid])
					high = mid - 1;
				else 
					low = mid + 1;
			}
			else
			{
				if(x > arr[mid] && x <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		

		return -1;
	}
	*/
	static int search(int[] nums, int target) {
        int rotIndex=0,i=nums.length-2;
        while(i>=0 && nums[i]<nums[i+1])
            i--;
        rotIndex=i+1;
        if(target>=nums[rotIndex] && target<=nums[nums.length-1])
        {
            for(i=rotIndex;i<nums.length;i++)
                if(target==nums[i])
                    return i;
        }
        else
        {
            for(i=0;i<rotIndex;i++)
                if(target==nums[i])
                    return i;
        }
        return -1;
    }
	public static void main(String args[]) 
    {

		int arr[] = {10, 20, 40, 60, 5, 8};

		int x = 5;

        System.out.println(search(arr, x));

    } 

}