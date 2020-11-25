
import java.io.*;
import java.util.*;

class printToN {

	
	static void printToN(int n)
	{
		if(n == 0)
			return;
		
		printToN(n - 1);

		System.out.print(n+" ");

	}
    public static void main(String [] args) 
    {
    	int n = 4;

    	printToN(n);
        
    }

}
// tail recursive approach
/**
 * import java.io.*;
import java.util.*;

class GFG {

	
	static void fun(int n, int k)
	{
		if(n == 0)
			return;

		System.out.print(k+" ");

		fun(n - 1, k + 1);

	}
    public static void main(String [] args) 
    {
   
    	fun(3, 1);
        
    }

}
 */