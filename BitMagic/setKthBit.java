//using left shift operator
class setKthBit { 
	public static void isKthBitSet(int n, 
								int k) 
	{ 
		if ((n & (1 << (k - 1))) == 1) 
			System.out.print("SET"); 
		else
			System.out.print("NOT SET"); 
	} 

	// driver code 
	public static void main(String[] args) 
	{ 
		int n = 39, k = 6; 
		isKthBitSet(n, k); 
	} 
} 
//using right shift operator
/**
 import java.io.*; 

class GFG 
{ 
static void isKthBitSet(int n, 
						int k) 
{ 
	if (((n >> (k - 1)) & 
			1) == 1) 
		System.out.println("SET"); 
	else
		System.out.println("NOT SET"); 
} 

// Driver code 
public static void main (String[] args) 
{ 
	int n = 5, k = 1; 
	isKthBitSet(n, k); 
} 
} 
 */