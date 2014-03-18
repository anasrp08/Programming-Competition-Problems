import java.io.*;
class SelfIntersection
{
	public static void main(String y[]) throws IOException
	{
		//System.out.println((int) '0'+" "+(int) 'a'); //48 97
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String x= br.readLine();
		String res="";
		
		String s[]=x.split(";");
		
		String pa[] = s[0].split(",");
		String pb[] = s[1].split(",");
		int c=0;
		
		for(int i=0;i<pa.length;i++)
		{
			for(int j=0;j<pb.length;j++)
			{
				if(pa[i].equals(pb[j]))
				{
					if(c==0)
					{	c=1;
						System.out.print(pa[i]);
					}
					else
					System.out.print(","+pa[i]);
					
					pb[j]=" ";
					break;
				}
			}
		}	
				
		
	}
}