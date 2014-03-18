//count number of vowels
import java.io.*;
class WordCount
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String sarray[]=str.split(" ");
		/*int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				count++;
		}*/
			System.out.println(sarray.length);
		
	}
}