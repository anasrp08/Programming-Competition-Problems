import java.io.*;
class SumDigits
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		int num = Integer.parseInt(x);
		
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println(sum);
	}
}