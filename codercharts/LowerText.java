import java.io.*;
class LowerText
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		System.out.println(x.toLowerCase());
	}
}