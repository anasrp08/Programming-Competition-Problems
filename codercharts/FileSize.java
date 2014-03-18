import java.io.*;

class FileSize
{
	public static void main(String args[]) throws IOException
	{
		File file = new File(args[0]);
		//BufferedReader in=new BufferedReader(new FileReader(file));
		
		System.out.println(file.length()); // double
	}
}