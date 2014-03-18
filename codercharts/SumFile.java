import java.io.*;
class SumFile
{
	public static void main(String args[]) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		int sum=0;
		String line;
		
		while((line = br.readLine())!=null)
		{
			sum=sum+Integer.parseInt(line);
		}
		
		System.out.println(sum);
		
		
	}
}