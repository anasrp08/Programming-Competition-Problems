
import java.util.*;
class MarkAndToys
{
	public static void main(String[] x)
	{
		Scanner sc=new Scanner(System.in);
		
		int len = sc.nextInt();
		
		int maxamt = sc.nextInt();
		int counter = 0 , sum=0;
		int ar[]=new int[len];
		
		for(int i=0;i<len;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		for(int k:ar)
		{
			sum = sum+k;
			if(sum>maxamt)
			break;
			
			counter++;
		}
		
		System.out.print(counter);
		
		
	}
}