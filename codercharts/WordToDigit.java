import java.io.*;
class WordToDigit
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		String s[]=x.split(";");
		for(int i=0;i<s.length;i++)
		System.out.print(num(s[i]));
		
		
	}
	
	public static int num(String str)
	{
		switch(str)
		{
			case "zero" : return 0;
			case "one": return 1;
			case "two": return 2;
			case "three": return 3;
			case "four": return 4;
			case "five": return 5;
			case "six": return 6;
			case "seven": return 7;
			case "eight": return 8;
			case "nine": return 9;
		}
		return 0;
	}
}