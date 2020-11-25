//simple approach
import java.io.*; 

class countSetBits { 
	/* Function to get no of set 
	bits in binary representation 
	of positive integer n */
	static int countSetBits(int n) 
	{ 
		int count = 0; 
    	while (n != 0) {
	      if (n % 2 != 0)
	        count++;
	      n = n/2;      
	    } 
	    return count; 
	} 

	// driver program 
	public static void main(String args[]) 
	{ 
		int i = 9; 
		System.out.println(countSetBits(i)); 
	} 
} 
// brian n kerningham
/**
 import java.io.*; 

class countSetBits { 
	static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n > 0) { 
			n &= (n - 1); 
			count++; 
		} 
		return count; 
	} 

	// driver program 
	public static void main(String args[]) 
	{ 
		int i = 9; 
		System.out.println(countSetBits(i)); 
	} 
} 
 */

//lookup table - o(1) time complexity

/**
import java.io.*; 

class GFG {
    
    static int []table = new int[256];
	
	// recursive function to count set bits 
	public static void initialize() { 

      // To initially generate the table algorithmically:
      table[0] = 0;
      for (int i = 0; i < 256; i++)
      {
          table[i] = (i & 1) + table[i / 2];
      }
	} 
	
	public static int countSetBits(int n)
	{
	    return table[n & 0xff] + 
        table[(n >> 8) & 0xff] + 
        table[(n >> 16) & 0xff] + 
        table[n >> 24]; 
	}
	
	// Driver function 
	public static void main(String[] args) { 
	    initialize();
		int n = 9; 
		System.out.println(countSetBits(n)); 
	} 
} 
 */