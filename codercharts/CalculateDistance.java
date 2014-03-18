
// (25, 4) (1, -6)
import java.io.*;

class CalculateDistance
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		
		String s[] = x.split("\\) \\(");
		//System.out.println(s[0]);
		//System.out.println(s[1]);
		
		
		String ap[]=s[0].split(", ");
		ap[0]=ap[0].replace("(","");
		//System.out.println(ap[0]);
		//System.out.println(ap[1]);
		
		
		int a= Integer.parseInt(ap[0]);
		int b= Integer.parseInt(ap[1]);
		
		
		String bp[]=s[1].split(", ");
		bp[1]=bp[1].replace(")","");
		
		int c= Integer.parseInt(bp[0]);
		int d= Integer.parseInt(bp[1]);
		
		int res = (int)Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));		
		
		System.out.println(res);
	}
}