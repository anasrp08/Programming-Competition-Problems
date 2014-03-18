import java.io.*;

class FindHacker

{
	public static void main(String x[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		String hc="hackerrank";
		
		while(test>0)
		{
			String str = br.readLine();
			if(str.startsWith(hc) && str.endsWith(hc))
			System.out.println("0");
			
			else
			
			if(str.startsWith(hc))
			System.out.println("1");
			
			else
			if( str.endsWith(hc))
			System.out.println("2");
			
			else
			
			System.out.println("-1");
			
			test--;
			
			
		}
		
		
		
	}
}