import java.io.*;
class ReverseWord
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String a[] = x.split(" ");
		for(int i=0;i<a.length-1;i++)
			System.out.print(a[a.length-i-1]+" ");
			
		System.out.println(a[0]);
	}
}