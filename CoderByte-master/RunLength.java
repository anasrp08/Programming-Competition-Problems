// few wrong ans
import java.io.*;
import java.util.*;
class RunLength 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		str=str.replace("\"","");
		
		
		char ch[] = new char[str.length()*2];
		
		for(int i=0;i<str.length();i++)
		{
			ch[2*i + 1] = str.charAt(i);
		}

		//count of digits


		for(int i=1;i<ch.length;i=i+2)
		{
			if(ch[i]!='@')
			{
				int count=0;
				for(int j=1;j<ch.length;j=j+2)
				{

					if(ch[i] == ch[j])
					{
						if(i!=j)
						{
							ch[j] = '@';
						}
						count++;
					}
				}

				ch[i-1] = (char) (count+48);
			}
		}

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='@')
			System.out.print(ch[i]);
		}
		System.out.println();

		//System.out.println((int) '0');  // 48

		

		
	}
}