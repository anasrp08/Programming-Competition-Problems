// For this challenge you will determine the third largest string within an array.
import java.io.*;
import java.util.*;
class ThirdLargestString
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		/*str=str.replace("(","");
		str=str.replace(")","");
		str=str.replace("\"","");*/

		System.out.println(third(str));
	}

	public static String third(String str)
	{
		String s[];
		str=str.replace("new String[] {","");
		str=str.replace("}","");
		str=str.replace("\"","");

		if(str.contains(", "))
		s=str.split(", ");
		else
		s=str.split(",");
		String result="";

		
		int len[]=new int[s.length];
		int a[]=new int[s.length];
		
		for (int i=0;i<s.length-1 ;i++ )
		{
			for(int j=0;j<s.length-1;j++)
			{
				if(s[j].length()>=s[j+1].length())
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
			
			
		}

		return s[s.length-3];
		


		
	} 
}