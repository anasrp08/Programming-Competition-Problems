import java.io.*;
class ArmstrongNumber
{
	public static void main(String y[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		
		int len = x.length();
		
		int num = Integer.parseInt(x);
		int arm=0 , temp=num;
		
		while(temp!=0)
		{
			arm = arm+(int)Math.pow((temp%10) , len);
			temp=temp/10;
			
		}
		
		if(arm==num)
		System.out.println("True");
		else
		System.out.println("False");
		//System.out.println(res);
		//System.out.println();
	}
	
}

