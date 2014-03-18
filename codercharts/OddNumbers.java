import java.io.*;
class OddNumbers
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;i<=99;i=i+2)
		{
			System.out.println(i);
		}
	}
}