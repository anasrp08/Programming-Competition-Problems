import java.io.*;
class MixedContet
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String res="";
		
		String s[]=x.split(",");
		
		String numstr="" , str = "";
		
		for(int i=0;i<s.length;i++)
		{
			if(isNum(s[i]))
			numstr=numstr.concat(","+s[i]);
			
			else
			str=str.concat(s[i]+",");
			
		}		
		//System.out.println(str);
		//System.out.println(numstr);
		
		if(str.equals(""))
		System.out.println(numstr.substring(1,numstr.length()));
		
		else
		if(numstr.equals(""))
		System.out.println(str.substring(0,str.length()-1));
		
		else
		{
			res= str+"|"+numstr;
			res=res.replace(",|,","|");
		
			System.out.println(res);
		}
	}
	
	public static boolean isNum(String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		
		catch(Exception e)
		{
			return false;
		}
		
		return true;
	}
}