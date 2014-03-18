import java.io.*;
class EvenNunber
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		int num = Integer.parseInt(x);
		
		if(num%2==0)
		System.out.println("1");
		
		else
		System.out.println("0");
		
		
		//System.out.println();
	}
}