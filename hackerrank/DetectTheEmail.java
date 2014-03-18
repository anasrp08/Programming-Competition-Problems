import java.io.*;
class DetectTheEmail



{
	public static void main(String x[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		
		while(test>0)
		{
			String str = br.readLine();
			
			if(str.contains("@"))
			
			
			test--;
			
			
		}
		
		
		
	}
}