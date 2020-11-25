//naive solution.
import java.io.*;

class power2 {
    
    static boolean isPow2(int n)
    {
        if(n == 0)
            return true;
        
        while(n != 1)
        {
            if(n % 2 != 0)
                return false;
            
            n = n / 2;
        }
        
        return true;
    }
	public static void main (String[] args) {
	    
	    int n = 4;
		System.out.println(isPow2(n));
	}
}
//efficient solution
/**
  import java.io.*;

class GFG {
    
    static boolean isPow2(int n)
    {
        if(n == 0)
            return true;
        
        return ((n & (n - 1)) == 0);
    }
	public static void main (String[] args) {
	    
	    int n = 4;
		System.out.println(isPow2(n));
	}
}
 */