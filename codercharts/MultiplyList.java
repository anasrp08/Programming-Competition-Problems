import java.io.*;
class MultiplyList
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		String s[]=x.split(" \\| ");
		//System.out.println(s[0]+" "+s[1]);
		String num1[] = s[0].split(" ");
		
		String num2[] = s[1].split(" ");
		
		for(int i=0;i<num1.length;i++)
		{
			//System.out.print(num1[i]+" "+num2[i]);
			int res=Integer.parseInt(num1[i])*Integer.parseInt(num2[i]);
			System.out.print(res+" ");
		}
		
		
		
	}
}