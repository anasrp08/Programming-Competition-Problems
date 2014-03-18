//For this challenge you will determine the mode, the number that appears most frequently, in an array.

import java.io.*;
import java.util.*;
class SimpleMode
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.replace("new int[] {","");
		str=str.replace("}","");

		String s[]=str.split(",");

		int count=0 , rescount=0;

		String result="";

		for(String x:s)
		{
			count=0;
			for(String y:s)
			{
				
				if(x.equals(y))
					count++;
			}

			if(count>rescount)
			{
				result = x;
				rescount = count;
			}
		}

		if(rescount==1)
			result = "-1";

		System.out.println(result);
	}
}

