//For this challenge you will determine if you can arrange a number to be a prime number.
import java.io.*;
import java.util.*;
class PrimeChecker
{
	public static void main(String[] args) throws IOException {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			int numlen=str.length();

			int num=Integer.parseInt(str);
			int i=0;
			while(i<=numlen-1)
			{
				if(prime(num))
				{
					System.out.println("1");
					break;
				}
				else
				{
					int d=num%10;
					int f=num/10;
					num=(int) (d*Math.pow(10,numlen-1) + f);
					//System.out.println(num);
				}
				i++;
			}

			if(i==numlen)
				System.out.println("0");
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static boolean prime(int num)
	{
		if(num%2==0 && num!=2)
			return false;

		for(int i=3;i*i<=num;i=i+2)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}

