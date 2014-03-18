import java.io.*;
class HexToDec
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		//int num = Integer.parseInt(x);
		int sum=0;
		
		for(int i=0;i<x.length();i++)
		{
			sum=sum+getchar(x.charAt(i))*(int)Math.pow(16,x.length()-i-1);
		}
		System.out.println(sum);
	}
	
	public static int getchar(char ch)
	{
		if(ch>='0'&& ch<='9')
		return (int)ch -48 ;
		
		else
		return (int)ch-87;
	}
}