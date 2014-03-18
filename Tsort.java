//import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

class Tsort
{

	public static void main(String x[]) throws IOException
	{
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuffer sbr=new StringBuffer("");
		PrintWriter out = new PrintWriter( new OutputStreamWriter(System.out));
		int a=Integer.parseInt(br.readLine());
		int b[]=new int[a];
		for(int i=0;i<a;i++)
			b[i]=Integer.parseInt(br.readLine());
		Arrays.sort(b);
		for(int k=0;k<a;k++)
			out.print(b[k]+"\n");
		//out.flush();
			//sbr.append(b[k]).append("\n");
			//System.out.print(sbr);

	}
}