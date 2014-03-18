//For this challenge you will determine if numbers within an array follow an
//Arithmetic sequence or a Geometric one. An example of an Arithmetic sequence
//is: 2, 4, 6, 8. A Geometric sequence is: 2, 4, 8, 16.

import java.io.*;
class ArrayAddition
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(11,str.length()-1);

		String s[]=str.split(",");
		int a[]=new int[s.length];
		int max=0;

		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);
			if(a[i]>max)
				max=a[i];
		}

		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++)
			{
				if(i!=j|| a[i]!=max || a[j]=max)
				{
					
				}
			}


		



		
		
	}//main
}//class

//(2,6,18,54)