//efficient approach using count array
import java.util.*;
import java.io.*;
import java.lang.*;

class leftmostRecurring {
    static final int CHAR = 256;

    static int leftMost(String str) {
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
    }
}

//efficient approach using array while traversing from left to right
/**
 * import java.util.*; import java.io.*; import java.lang.*;
 * 
 * class GFG { 
 * static final int CHAR=256; 
 * static int leftMost(String str) {
 * int[] fIndex=new int[CHAR]; 
 * Arrays.fill(fIndex,-1); 
 * int res=Integer.MAX_VALUE; 
 * for(int i=0;i<str.length();i++){ 
 * int fi=fIndex[str.charAt(i)]; 
 * if(fi==-1) fIndex[str.charAt(i)]=i; 
 * else
 * res=Math.min(res,fi); 
 * }
 * 
 * return (res==Integer.MAX_VALUE)?-1:res; 
 * }
 * 
 * public static void main(String args[]) { String str = "geeksforgeeks";
 * System.out.println("Index of leftmost repeating character:");
 * System.out.println(leftMost(str)); } }
 */





 //right to left
 
 /**
  * 
  * import java.util.*; import java.io.*; import java.lang.*;
  * 
  * class GFG { static final int CHAR=256; static int leftMost(String str) {
  * boolean[] visited=new boolean[CHAR]; int res=-1; for(int
  * i=str.length()-1;i>=0;i--){ if(visited[str.charAt(i)]) res=i; else
  * visited[str.charAt(i)]=true; }
  * 
  * return res;
  * 
  * }
  * 
  * public static void main(String args[]) { String str = "geeksforgeeks";
  * System.out.println("Index of leftmost repeating character:");
  * System.out.println(leftMost(str)); } }
  * 
  */