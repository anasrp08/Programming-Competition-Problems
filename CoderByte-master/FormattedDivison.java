import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class FormattedDivison
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String str=br.readLine();
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		double res= (double)a/b;

		DecimalFormat d=new DecimalFormat("#.0000");
		//d.setMinimumFractionDigits(4);
		//d.setMaximumFractionDigits(4);
		//String x=d.format(res);
		
		//System.out.println(x);

		//System.out.printf("%,.2f%n", res);
		//System.out.printf("%.4f%n", res);

		String resstr=d.format(res);
		
		StringBuffer sbf = new StringBuffer("");

		
		System.out.println(resstr);
		
		String str = resstr.substring(0,resstr.indexOf("."));
		System.out.println(str);

		if(str.length()<=3)
		{
			System.out.println(resstr);

		}
		else
		
		{
			for(int i=0;i< str.length();i++)
			{
				sbf.append(str.charAt(i));
				if((str.length()-3 -i) % 2 ==1)
				{
					sbf.append(",");
				}

			}
			sbf = sbf.append(resstr.substring( resstr.indexOf("."),resstr.length() ));
			System.out.println(sbf);
		}
		
	}
}

/*
import java.util.*; 
import java.io.*;
import java.text.DecimalFormat;

class Function {  
  String DivisionStringified(int a, int b) { 
  

  	
		double res= (double)a/b;

		DecimalFormat d=new DecimalFormat("#.0000");
		//d.setMinimumFractionDigits(4);
		//d.setMaximumFractionDigits(4);
		//String x=d.format(res);
		
		//System.out.println(x);

		//System.out.printf("%,.2f%n", res);
		//System.out.printf("%.4f%n", res);

		String resstr=d.format(res);
		
		StringBuffer sbf = new StringBuffer("");

		
		//System.out.println(resstr);
		
		String str = resstr.substring(0,resstr.indexOf("."));
		//System.out.println(str);

		if(str.length()<=3)
		{
			return resstr;

		}
		else
		
		{
			for(int i=0;i< str.length();i++)
			{
				sbf.append(str.charAt(i));
				if((str.length()-3 -i) % 2 ==1)
				{
					sbf.append(",");
				}

			}
			sbf = sbf.append(resstr.substring( resstr.indexOf("."),resstr.length() ));
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




