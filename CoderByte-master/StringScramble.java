import java.io.*;
import java.util.*;
class StringScramble
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();

		String str2 = br.readLine();

		
		char ch1[]=str1.toCharArray();
		
		char ch2[]=str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		int p=0 ,i=0,j=0;

		for(i=0;i<ch2.length;i++)
		{
			for(j=0;j< ch1.length;j++)
			{
				if(ch2[i] == ch1[j])
				{
					ch1[j] = '@';
					break;
				}
			}
			if(j==ch1.length)
			{
				p=1;
				break;
			}

		}

		if(p==1)
		{
			System.out.println("false");
		}
		else
			System.out.println("true");
	
		
	}
}

/*
import java.util.*; 
import java.io.*;

class Function {  
  String StringScramble(String str1, String str2) { 
  
    char ch1[]=str1.toCharArray();
		
		char ch2[]=str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		int p=0 ,i=0,j=0;

		for(i=0;i<ch2.length;i++)
		{
			for(j=0;j< ch1.length;j++)
			{
				if(ch2[i] == ch1[j])
				{
					ch1[j] = '@';
					break;
				}
			}
			if(j==ch1.length)
			{
				p=1;
				break;
			}

		}

		if(p==1)
		{
			return "false";
		}
		else
			return "true";
	
		
	
  
    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.StringScramble(s.nextLine())); 
    
  }
} 








  
*/

