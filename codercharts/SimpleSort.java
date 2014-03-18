import java.io.*;
import java.util.Arrays;
class SimpleSort
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String s[]=x.split(" ");
		
		double a[] = new double[s.length];
		
		for(int i=0;i<s.length;i++)
		a[i]=Double.parseDouble(s[i]);
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		
		
	}
}