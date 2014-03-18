import java.io.*;
class LongestString
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		s=s.substring(1,s.length()-1);
		StringBuilder str=new StringBuilder("");
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) || s.charAt(i)==' ')
				str.append(s.charAt(i));
		}


		String newString=new String(str);
		String st[]=newString.split(" ");
		String res="";
		int reslen=0;
		for(int i=0;i<st.length;i++)
		{
			if(st[i].length()>res.length())
				res=st[i];
		}
		System.out.println(res);
	}
}