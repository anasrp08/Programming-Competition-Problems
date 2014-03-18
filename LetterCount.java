import java.io.*;
import java.util.*;
class LetterCount
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		str=str.replace("\"","");

		String s[]=str.split(" ");
		int rescount=0;
		String res="";

		for(String x: s) // Advanced for
		{
			//System.out.println(x);
			int count;

			char ch[]= x.toCharArray();

			for(int i=0;i<ch.length;i++)
			{
				count=1;
				for(int j=0;j<ch.length;j++)
				{
					if(ch[i]==ch[j] && i!=j)
						count++;
				}

				if(count>rescount)
				{
					rescount=count;
					res=x;

				}
			}

			

			/*if(count>rescount)
			{
				rescount=count;
				res=x;
			}*/

		}
		if(rescount==1)
				res="-1";

		System.out.println(res);

		
	}
}

