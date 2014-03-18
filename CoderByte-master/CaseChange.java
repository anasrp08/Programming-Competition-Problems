import java.io.*;
class CaseChange 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(1,str.length()-1);
		StringBuilder res=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				res.append(Character.toLowerCase(str.charAt(i)));
			}
			else

			if(Character.isLowerCase(str.charAt(i)))
			{
				res.append(Character.toUpperCase(str.charAt(i)));
			}

			else
				res.append(str.charAt(i));
		}

		System.out.println(res);
		
	}
}