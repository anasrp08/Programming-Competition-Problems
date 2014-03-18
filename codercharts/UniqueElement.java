import java.io.*;
import java.util.Stack;
class UniqueElement
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String res="";
		
		String s[]=x.split(",");
		
		System.out.print(s[0]);
		for(int i=1;i<s.length;i++)
		{
			if(!s[i].equals(s[i-1]))
			{
				System.out.print(","+s[i]);
				
			}
		}	
				
		
	}
}