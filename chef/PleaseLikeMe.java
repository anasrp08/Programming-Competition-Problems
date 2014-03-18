import java.io.*;
class PleaseLikeMe
{
	public static void main(String x[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		
		while(test>0)
		{
			String str [] = br.readLine().split(" ");
			
			long l= Long.parseLong(str[0]); 
			long d=Long.parseLong(str[1]);
			long s=Long.parseLong(str[2]);
			long c=Long.parseLong(str[3]);
			long total = s;
			boolean p=false;
			
			
			while(d!=1)
			{
				total = s+(c*s);
				s=total;
				d--;
				
				if(total>=l)
				{
					System.out.println("ALIVE AND KICKING");
					p = true;
					break;
				}
				
				
			} 
			
			if(p==false && total>=l)
			System.out.println("ALIVE AND KICKING");
			
			else
			System.out.println("DEAD AND ROTTING");
					
			/*if(str.contains("010") || str.contains("101"))
			{
				System.out.println("Good");
			}
			
			else
			
			System.out.println("Bad");
			*/
			
			test--;
			
			
		}
		
		
		
	}
}