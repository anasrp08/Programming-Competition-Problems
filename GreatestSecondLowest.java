//For this challenge you will determine the second lowest and second greatest numbers in an array.
import java.io.*;
import java.util.*;
class GreatestSecondLowest
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(11,str.length()-1);
		//str=str.replace("\"","");
		String s[];
		if(str.contains(", "))
		s=str.split(", ");
		else
		s=str.split(",");
		int a[]=new int[s.length];

		for(int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		
		if(a.length>2)
		System.out.println(a[1]+" "+a[a.length-2]);
		else
			System.out.println(a[1]+" "+a[0]);

		
	}
}