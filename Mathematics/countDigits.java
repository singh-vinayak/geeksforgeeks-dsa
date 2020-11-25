import java.io.*;
import java.util.*;
import static java.lang.System.out;

class countDigits {

	
	static int countDigit(int x)
	{
		int res = 0;

		while(x > 0)
		{
				x = x / 10;

				res++;
		}	

		return res;
	}

	public static void main (String[] args) {
		
		int number = 789;

		System.out.println(countDigit(number));

	}
}