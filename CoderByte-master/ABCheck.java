import java.io.*;
import java.util.*;
class ABCheck
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(1,str.length()-1);
		int ap=0,bp=0 , proceed=0;
		
		
		//System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
				ap=i;
			else
			if(str.charAt(i)=='b')
			{

				bp=i;
				if(bp-ap!=4)
				{
					//proceed=1;
					//System.out.println("false");
					//break;
					ap=0;
					bp = 0;
				}
				else
				{
					System.out.println("true");
					proceed=1;
					break;
				}
			}

			
		}

		if(proceed==0)
				System.out.println("false");


	}



}