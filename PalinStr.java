import java.io.*;
class PalinStr 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(1,str.length()-1);
		StringBuilder sbr=new StringBuilder("");

		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
				sbr.append(Character.toLowerCase(str.charAt(i)));
		}
		//System.out.println(sbr);
		
		str=new String(sbr);
		//System.out.println(str);

		StringBuffer pst= new StringBuffer(str);
		pst.reverse();
		String newString=new String(pst);
		
		
		if(str.equals(newString))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}