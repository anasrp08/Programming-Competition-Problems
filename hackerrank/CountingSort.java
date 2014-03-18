import java.util.*;

class CountingSort
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
			System.out.print(k+" ");
		}
	}
}