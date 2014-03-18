//For this challenge you will be manipulating characters in a string based off their positions in the alphabet.
import java.io.*;
import java.util.*;
class LetterChanges
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(1,str.length()-1);
		char ch[]=str.toCharArray();

		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='z')
				ch[i]='a';




			else

			if(Character.isLetter(ch[i]))
			ch[i]=(char)((int) ch[i]+1);
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				ch[i]= Character.toUpperCase(ch[i]);
			}
		}
		str=String.valueOf(ch);
		System.out.println(str);
		
	}
}