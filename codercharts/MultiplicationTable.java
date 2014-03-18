import java.io.*;
class MultiplicationTable
{
	public static void main(String y[]) throws IOException
	{
		for(int i=1;i<=12;i++)
		{
			for(int j=1;j<=12;j++)
			{
				int a=i*j;
				
				if(a<10)
				System.out.print((i*j)+"    ");
				
				else
				if(a<100)
				System.out.print((i*j)+"    ");
				
				else
				System.out.print((i*j)+"    ");
				
				
				
			}
			System.out.println();
		}
	}
	
}