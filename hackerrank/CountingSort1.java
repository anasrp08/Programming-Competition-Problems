import java.util.*;

class CountingSort1
{
	public static void main(String[] x)
	{
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		
		int ar[]=new int[100];
		
		for(int i=0;i<len;i++)
		{
			ar[sc.nextInt()]++;
		}
		
		for(int k: ar)
		{
			while(k>0)
			{
				System.out.print(ar[k]+" ");
				k--;
			}
			
		}
	}
}