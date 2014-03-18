import java.io.*;
import java.util.*;
class TotalMinutes
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		String s[]=str.split("-");
		String time1=s[0];
		String time2=s[1];

		int h1=0, m1=0 ,h2=0 ,m2=0;

		String time[]=time1.split(":");

		if(time[1].contains("am"))
		h1=Integer.parseInt(time[0]);

		else
			h1=Integer.parseInt(time[0])+12;

		m1=Integer.parseInt(time[1].substring(0,2));


		time=time2.split(":");


		else
			h2=Integer.parseInt(time[0])+12;

		m2=Integer.parseInt(time[1].substring(0,2));
		
		/*System.out.println(h1);
		System.out.println(m1);
		System.out.println(h2);
		System.out.println(m2);
		*/

		int rh=0 , rm = 0;

		rm=m1-m2;
		if(rm>59)
		{
			rh++;
			rm=rm-60;
		}
		rh=rh+h1-h2;


		
		
	}
}

