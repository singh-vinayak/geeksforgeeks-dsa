import java.io.*;
import java.util.*;

class sumUptoN {

	
	static int getSum(int n,int k)
	{
		if(n == 0)
			return k;

		return getSum(n - 1,n+k);

	}
    public static void main(String [] args) 
    {
    	int n = 4;
    	
    	System.out.println(getSum(n,0));
        
    }

}