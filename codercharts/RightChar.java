import java.io.*;

class RightChar
{
	public static void main(String args[]) throws IOException
	{
		File file = new File(args[0]);
		
		BufferedReader in = new BufferedReader(new FileReader(file));
		
		String line;
		
		
		while((line=in.readLine())!=null)
		{
			String t[]=line.split(",");
			System.out.println(t[0].indexOf(t[1].charAt(0)));
		}		
		/* char ch='0';
		 System.out.println("Hello".indexOf(ch));*/
	}
}