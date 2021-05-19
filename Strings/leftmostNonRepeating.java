
import java.util.*;
import java.io.*;
import java.lang.*;

class leftmostNonRepeating {
    static final int CHAR = 256;

    static int nonRep(String str) {
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "geeksforgeeks";
        System.out.println("Index of leftmost non-repeating element:");
        System.out.println(nonRep(str));
    }
}

//efficient approach in a single traversal
/**
 * import java.util.*; import java.io.*; import java.lang.*;
 * 
 * class GFG { static final int CHAR=256; static int nonRep(String str) { int[]
 * fI=new int[CHAR]; Arrays.fill(fI,-1);
 * 
 * for(int i=0;i<str.length();i++){ if(fI[str.charAt(i)]==-1)
 * fI[str.charAt(i)]=i; else fI[str.charAt(i)]=-2; } int res=Integer.MAX_VALUE;
 * for(int i=0;i<CHAR;i++){ if(fI[i]>=0)res=Math.min(res,fI[i]); } return
 * (res==Integer.MAX_VALUE)?-1:res; }
 * 
 * public static void main(String args[]) { String str = "geeksforgeeks";
 * System.out.println("Index of leftmost non-repeating element:");
 * System.out.println(nonRep(str)); } }
 */