import java.io.*;

class NmodM
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		String s[] = x.split(",");
		
		int a = Integer.parseInt(s[0]);
		int b= Integer.parseInt(s[1]);
		
		System.out.println(a-(b*(a/b)));
	}
}