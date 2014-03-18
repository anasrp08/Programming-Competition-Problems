import java.io.*;
import java.util.*;

class Consecutive 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(11,str.length()-1);
		String s[];
		if(str.contains(", "))
		s=str.split(", ");
		else
		s=str.split(",");
		int max=0,min=100000;
		for(int i=0;i<s.length;i++)
		{
			if(Integer.parseInt(s[i])>max)
				max=Integer.parseInt(s[i]);
			if(Integer.parseInt(s[i])<min)
				min=Integer.parseInt(s[i]);
		}
		System.out.println(max-min+1-s.length);
		
	}
	
}