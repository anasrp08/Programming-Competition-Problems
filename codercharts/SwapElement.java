
import java.io.*;

class SwapElement
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		String s[] = x.split(" ");
		
		String swap[]=s[s.length-1].split("-");
		int a=Integer.parseInt(swap[0]);
		int b=Integer.parseInt(swap[1]);
		
		String temp="";
		temp=s[a];
		s[a] = s[b];
		s[b] = temp;
		
		for(int i=0;i<s.length-3;i++)
		System.out.print(s[i]+" ");
		
		
		//System.out.println(res);
	}
}