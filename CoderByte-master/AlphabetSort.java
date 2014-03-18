//For this challenge you will be sorting characters in a string.
import java.io.*;
import java.util.*;
class AlphabetSort
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		st=st.substring(1,st.length()-1);
		char ch[]=st.toCharArray();
		Arrays.sort(ch);
		st=String.valueOf(ch);
		System.out.println(st);
	}
}
