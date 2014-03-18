import java.io.*;
import java.util.*;
class BracketMatch
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.substring(1,str.length()-1);
		System.out.println(bracket(str));
	}

	public static int bracket(String str)
	{
		Stack s=new Stack();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(')
			{
				
					s.push(ch);

				
			}
				
			

			if(ch==')')
			{
				if(!s.empty())
					s.pop();
				else return 0; // incorrect

			}
				
			


		}

		if(s.empty())
			return 1; //correct
		else 
			return 0; //incorrect
	}
}