import java.util.*;
//import java.io.*;

class PrimeNum

{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		
		StringBuilder str=new StringBuilder("");
		if(num % 2 == 0)
		num--;
		//System.out.println(num);
		
		if(num>=2)
		System.out.print("2,");
		for(int i=3;i<=num;i+=2)
		{
			if(prime(i))
			{
				str.append(i+",");
			}
		}
		
		if(str.length()>0)
		System.out.println(str.substring(0,str.length()-1));
		
		
	
	}
	
	public static boolean prime(int num)
	{
		for(int i=3;i*i<=num;i+=2)
		{
			if(num%i==0)
			return false;
		}
		
		return true;
	}
}