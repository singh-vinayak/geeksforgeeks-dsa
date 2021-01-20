//three-way partioning when multiple occurence of pivot exists
import java.util.*;
import java.lang.*;
import java.io.*;

class sort3typeQ2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 1, 2, 0, 1, 1, 2,1,1,0,0,2,2};

        int n = arr.length;

        partition(arr, n,1);

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void partition(int arr[], int n,int pivot) {
        int l = 0, h = n - 1, mid = 0;
        while (mid <= h) {
            if(arr[mid]<pivot){
                int temp=arr[mid];
                arr[mid]=arr[l];
                arr[l]=temp;
                l++;
                mid++;
            }
            else if(arr[mid]== pivot)
            mid++;
            else{
                int temp=arr[h];
                arr[h]=arr[mid];
                arr[mid]=temp;
                h--;
            }
        }

    }
}