import java.io.*;
class MultipleNumber
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String s[]=str.split(",");
		
		int x= Integer.parseInt(s[0]);
		int n= Integer.parseInt(s[1]);
		/*int x = Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		*/
		int t=x/n;
		if(x%n==0)
		System.out.println(x);
		
		else
		
		System.out.println(n*(t+1));
		
	}
}