import java.io.*;
class HiddenDigts
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		boolean change=false;
		String res="";
		for(int i=0;i<x.length();i++)
		{
			char ch=x.charAt(i);
			if(ch>='a' && ch<='j')
			{
			//res.concat((int)ch-96);
			change=true;
			System.out.print((int)ch-96);
			}
			if(ch>='0' && ch<='9')
			{
				System.out.print(ch);
				change=true;
			}
		}
		
		if(change==false)
		System.out.println("NONE");
		
		else
		System.out.println();
	}
	
}

/*
//Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
    
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String x=line;
            //Process line of input Here
            
        boolean change=false;
		String res="";
    		for(int i=0;i<x.length();i++)
    		{
    			char ch=x.charAt(i);
    			if(ch>='a' && ch<='j')
    			{
    			//res.concat((int)ch-96);
    			change=true;
    			System.out.print((int)ch-96);
    			}
    			if(ch>='0' && ch<='9')
    			{
    				System.out.print(ch);
    				change=true;
    			}
    		}
    		    
		if(change==false)
		System.out.println("NONE");
		
		else
		System.out.println();
            
            
            
            
        }
    
  }
}


*/