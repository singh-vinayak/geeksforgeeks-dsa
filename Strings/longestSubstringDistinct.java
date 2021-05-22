//find the longest substring with distinct characters

// naive solution has n^3 tie complexity

import java.util.*;
import java.io.*;
import java.lang.*;
  
class naive { 
    static boolean areDistinct(String str, int i, int j) 
    { 
    
	boolean visited[]=new boolean[256]; 

	for (int k = i; k <= j; k++) { 
		if (visited[str.charAt(k)] == true) 
			return false; 
		visited[str.charAt(k)] = true; 
	} 
	return true; 
    } 

    static int longestDistinct(String str) 
    { 
	int n = str.length(); 
	int res = 0;
	for (int i = 0; i < n; i++) 
		for (int j = i; j < n; j++) 
			if (areDistinct(str, i, j)) 
				res = Math.max(res, j - i + 1); 
	return res; 
    } 
    
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
	    int len = longestDistinct(str);  
        System.out.print("The length of the longest distinct characters substring is "+ len); 
    } 
} 

//better approach has n^2 time complexity. works by creating separate boolean aaray for each substring
// import java.util.*;
// import java.io.*;
// import java.lang.*;

class better {

    static int longestDistinct(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean visited[] = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)] == true) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int len = longestDistinct(str);
        System.out.print("The length of the longest distinct characters substring is " + len);
    }
}

//efficient with linear time complexity

// import java.util.*;
// import java.io.*;
// import java.lang.*;

class longestSubstringDistinct {

    static int longestDistinct(String str) {
        int n = str.length();
        int res = 0;
        int prev[] = new int[256];
        Arrays.fill(prev, -1);
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[str.charAt(j)] + 1);
            int maxEnd = j - i + 1;
            res = Math.max(res, maxEnd);
            prev[str.charAt(j)] = j;
        }
        return res;
    }

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        int len = longestDistinct(str);
        System.out.print("The length of the longest distinct characters substring is " + len);
    }
}