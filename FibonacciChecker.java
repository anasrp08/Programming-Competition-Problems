//For this challenge you will be determining whether a number is part of the Fibonacci sequence.
import java.io.*;
import java.util.*;
class FibonacciChecker
{
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());

	System.out.println(check(num));
		
	}


	public static String check(int num)
	{
		if(num == 0 || num == 1)
			return "yes";

		int a=0 , b=1 , c=1;

		while(c<num)
		{
			c= a+b;
			a=b;
			b=c;

		}

		if(c==num)
			return "yes";

	
		return "no";


	
	}
}

