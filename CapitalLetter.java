import java.io.*;
import java.util.*;
class CapitalLetter
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//str=str.substring(1,str.length()-1);
		String ab[]=str.split(" ");
		StringBuilder res= new StringBuilder("");
		for(int i=0;i<ab.length;i++)
		{
			res.append(Character.toUpperCase(ab[i].charAt(0)));
			res.append(ab[i].substring(1,ab[i].length()));
			res.append(" ");
		}
		System.out.println(res);



		
	}
}