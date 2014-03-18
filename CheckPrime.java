import java.io.*;
class CheckPrime
{
	public static void main(String[] args) throws IOException
	 {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		System.out.println(prime(num));
		/*if(prime(num))
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("Not primr");
			}
			*/
	
	}

	public static boolean prime(int num)
	{
		if(num%2==0)
			return false;
		for(int i=3;i*i<=num;i=i+2)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}