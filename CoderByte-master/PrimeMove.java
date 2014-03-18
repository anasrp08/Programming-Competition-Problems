//Returns nth prime
import java.io.*;
class PrimeMove
{
	public static void main(String[] args) throws IOException
	 {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num==1)
			System.out.println("2");
		else
		{
			int res=1 ,i=3;
			while(res!=num)
			{
				if(prime(i))
				{
					res++;
				}
				i=i+2;
			}
			System.out.println(i-2);
		}
		
		
	}

	public static boolean prime(int num)
	{
		for(int i=3;i*i<=num;i=i+2)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}