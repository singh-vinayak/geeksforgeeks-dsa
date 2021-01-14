//merge 2 arrays after soring their combination
//naive solution
import java.util.*;
import java.lang.*;
import java.io.*;

class merge2Arrays
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
        
    }
    
    static void merge(int a[], int b[], int m, int n){
    
        int[] c=new int[m+n];
        for(int i=0;i<m;i++)
            c[i]=a[i];
        for(int j=0;j<n;j++)
            c[j+m]=b[j];
        
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
    }
}

//efficient solution 
/**
 * 
 * import java.util.*; import java.lang.*; import java.io.*;
 * 
 * class Solution { public static void main(String[] args) { int a[] = new int[]
 * { 10, 15, 20, 40 }; int b[] = new int[] { 5, 6, 6, 10, 15 };
 * 
 * int m = a.length; int n = b.length; merge(a, b, m, n);
 * 
 * }
 * 
 * static void merge(int a[], int b[], int m, int n) {
 * 
 * int i = 0, j = 0; while (i < m && j < n) { if (a[i] < b[j])
 * System.out.print(a[i++] + " "); else System.out.print(b[j++] + " "); } while
 * (i < m) System.out.print(a[i++] + " "); while (j < n) System.out.print(b[j++]
 * + " "); } }
 * 
 * 
 */