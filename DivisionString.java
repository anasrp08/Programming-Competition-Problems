import java.io.*;
import java.util.*;
class DivisionString
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String str=br.readLine();
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		double res= (double)a/b;

		StringBuffer sbf = new StringBuffer("");

		String str=String.valueOf((int)Math.round(res));
		System.out.println((int)Math.round(res));
		
		char ch[]=new char[str.length()*2];
		if(str.length()<=3)
		{
			System.out.println(str);

		}
		else
		for(int i=0;i< str.length();i++)
		{
			sbf.append(str.charAt(i));
			if((str.length()-3 -i) % 2 ==1)
			{
				sbf.append(",");
			}

		}
		System.out.println(sbf);

		
	}
}

/*
import java.util.*; 
import java.io.*;

class Function {  
  String DivisionStringified(int a, int b) { 
  

  		double res= (double)a/b;

		StringBuffer sbf = new StringBuffer("");

		String str=String.valueOf((int)Math.round(res));
		
		char ch[]=new char[str.length()*2];
		if(str.length()>3)
		{
			for(int i=0;i< str.length();i++)
			{
				sbf.append(str.charAt(i));
				if((str.length()-3 -i) % 2 ==1)
				{
					sbf.append(",");
				}

			}

			str = sbf.toString();
		}
   
       
    return str;
    
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.DivisionStringified(s.nextLine())); 
    
  }
} 

*/





