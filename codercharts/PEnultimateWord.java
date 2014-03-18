import java.io.*;
class PEnultimateWord
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String s[]=x.split(" ");
		System.out.println(s[s.length-2]);
		
		
	}
}