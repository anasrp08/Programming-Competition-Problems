//import java.util.*;
import java.io.*;

class MToLast

{
	public static void main(String x[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String s[]=str.split(" ");
		
		
		int val = Integer.parseInt(s[s.length-1]);
		if(val<=s.length-1)
		System.out.println(s[s.length - Integer.parseInt(s[s.length-1])-1]);	
		
		
		
	}
}