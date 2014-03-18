import java.io.*;
class ChefAndFeedback
{
	public static void main(String x[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		
		while(test>0)
		{
			String str = br.readLine();
			if(str.contains("010") || str.contains("101"))
			{
				System.out.println("Good");
			}
			
			else
			
			System.out.println("Bad");
			
			
			test--;
			
			
		}
		
		
		
	}
}