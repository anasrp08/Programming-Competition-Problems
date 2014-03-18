import java.io.*;
import java.util.Stack;
class BitPosition
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String res="";
		
		String st[]=x.split(",");
		
		int num = Integer.parseInt(st[0]);
		Stack s=new Stack();
		int bin=0;
		while(num!=0)
		{
			s.push(num%2);
			num=num/2;
		}
		
		while(!s.empty())
		{
			res=res.concat(s.pop().toString());
		}
		
		//System.out.println(res);
		
		
		if(res.charAt(res.length()-Integer.parseInt(st[1])) == res.charAt(res.length()-Integer.parseInt(st[2])))
		System.out.println("true");
		
		else
		System.out.println("false");
		
	}
}