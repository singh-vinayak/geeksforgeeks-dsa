import java.io.*;
import java.util.*;

class numOFDig {

	
	static int fun(int n)
	{
		if(n < 10)
			return n;

		return fun(n / 10) + n % 10;
	}
    public static void main(String [] args) 
    {
    	
    	System.out.println(fun(253));
        
    }

}
/**
 * import java.io.*;
import java.util.*;

class GFG {

	
	static int fun(int n,int k)
	{
		if(n < 10)
			return k;

		return fun(n / 10,n%10+k);
	}
    public static void main(String [] args) 
    {
    	
    	System.out.println(fun(253,0));
        
    }

}
 */