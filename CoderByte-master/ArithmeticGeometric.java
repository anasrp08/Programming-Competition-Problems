//For this challenge you will determine if numbers within an array follow an
//Arithmetic sequence or a Geometric one. An example of an Arithmetic sequence
//is: 2, 4, 6, 8. A Geometric sequence is: 2, 4, 8, 16.

import java.io.*;
class ArithmeticGeometric
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(11,str.length()-1);

		String s[]=str.split(",");
		int a[]=new int[s.length];

		int newdiff=0, olddiff=0, ratio=0;
		int newratio=0 , oldratio=0;
		boolean ap=true , gp=true;

		a[0]=Integer.parseInt(s[0]);
		a[1]=Integer.parseInt(s[1]);

		olddiff=a[1]-a[0];
		oldratio=a[1]/a[0];


		for(int i=1;i<a.length;i++)
		{
				a[i]=Integer.parseInt(s[i]);
			
				if(ap)
				newdiff=a[i]-a[i-1];

				if(olddiff!=newdiff)
				{
					ap=false;

				}



				if(a[i]%a[i-1]==0 && gp==true)
				newratio=a[i]/a[i-1];

				else
					gp=false;

				if(newratio!=oldratio)
					gp=false;
				

			
		}

		if(ap)
		{
			System.out.println("Arithmetic");
		}

		else

		if(gp)
		{
			System.out.println("Geometric");
		}

		else
			System.out.println("-1");



		
		
	}
}

//(2,6,18,54)