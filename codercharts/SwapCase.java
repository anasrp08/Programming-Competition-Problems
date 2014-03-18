import java.io.*;
class SwapCase
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		StringBuilder res = new StringBuilder("");
		
		for(int i=0;i<x.length();i++)
		{
			char ch=x.charAt(i);
			
			if(ch>='A' && ch<='Z')
			res.append(Character.toLowerCase(ch));
			
			else
			
			if(ch>='a' && ch<='z')
			res.append(Character.toUpperCase(ch));
			
			else
			res.append(ch);
		}
		System.out.println(res);
	}
}