import java.io.*;
class Fibonacci
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		int num = Integer.parseInt(x);
		
		
		System.out.println(fibo(num));
	}
	
	public static int fibo(int num)
	{
		if(num==1)
		return 0;
		
		if(num ==2 )
		return 1;
		
		else
		{
			int a=0 , b=1 ,c=1, count=1;
			
			while(count!=num)
			{
				c=a+b;
				a=b;
				b=c;
				count++;
			}
			
			return c;
			
		}
	}
}