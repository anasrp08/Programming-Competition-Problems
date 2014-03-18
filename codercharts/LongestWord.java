import java.io.*;
class LongestWord
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		String s[]=x.split(" ");
		String res="";
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>res.length())
			{
				res=s[i];
			}
		}
		System.out.println(res);
		//System.out.println();
	}
	
}

