//dynamic programming program
//for fibonacci series

import java.io.*;
import java.util.*;
import static java.lang.System.out;

class fibonacci {

	static int[] memo;

	static int fib(int n)
	{
	    if(memo[n]==-1)
	    {
	        int res;
	        
	        if(n==0 || n==1)
	            return n;
	        
	        else
	           { res = fib(n-1)+fib(n-2);
	           
	            
	           }
	           
	           memo[n]=res;
	            
	        
	    }
	    
	    return memo[n];
	}


	public static void main (String[] args) {
		
		int n = 5;

		memo = new int[n+1];

		Arrays.fill(memo,-1);

		out.println(fib(n));

	}
}

//below is bottom-up approach

// static int fib(int n)
//         {
//             int f[] = new int[n+1];
            
//             f[0]=0;
//             f[1]=1;
            
//             for(int i=2;i<=n;i++)
//             {
//                 f[i] = f[i-1] + f[i-2];
//             }
            
        
//             return f[n];
            
//         }