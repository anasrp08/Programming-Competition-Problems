/*For this challenge you will transform a string using the Caesar Cipher which works by shifting
 a certain character N places in the alphabet.
*/
 
import java.io.*;
import java.util.*;
class CeaserCipher
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int a=Integer.parseInt(br.readLine());

		StringBuilder s=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				char ch = (char)((int)(str.charAt(i)+a));
				if(ch>'Z' && ch<'a')
					ch=(char)((int)ch - (int)'Z'  + (int)'A' -1);

				else
					if(ch>'z')
						ch =(char) (ch - (int)'z' + (int)'a' -1);
						//ch=(char)((int)ch - (int)'z' + (int)'a' -1);
				s.append(ch);
			}
			

			else
				s.append(str.charAt(i));
		}
		System.out.println(s);
		//System.out.println((int) 'a' +" " + (int) 'A');
	}
}

/*
import java.util.*; 
import java.io.*;

class Function {  
  StringBuilder CaesarCipher(String str, int a) { 
  
  	  StringBuilder s=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				char ch = (char)((int)(str.charAt(i)+a));
				if(ch>'Z' && ch<'a')
					ch=(char)((int)ch - (int)'Z'  + (int)'A' -1);

				else
					if(ch>'z')
						ch =(char) (ch - (int)'z' + (int)'a' -1);
						//ch=(char)((int)ch - (int)'z' + (int)'a' -1);
				s.append(ch);
			}
			
			else
				s.append(str.charAt(i));
		}
		
       
    return s;
    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CaesarCipher(s.nextLine())); 
    
  }
} 

*/






  

