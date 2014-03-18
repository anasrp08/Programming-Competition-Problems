import java.io.*;
import java.util.*;
class RepeatedCharacters
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.replace("\"","");
		System.out.println(repeat(str));
		
	}

	public static String repeat(String str)
	{

		String s[]=str.split(" ");
		int count=0;
		String res="";
		for(int i=0;i<s.length;i++)
		{
			int charcount=maxchar(s[i]);
			if(charcount>count)
			{
				count=charcount;
				res=s[i];
			}
		}
		if(count==1)
			return "-1";
		else
		return res;
	}

	public static int maxchar(String str)
	{
		int rescount=0;
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && i!=j)
					count++;
			}
			if(count>rescount)
				rescount=count;
		}
		return rescount;
	}

}