import java.util.*;

class BinarySearch
{
	public static void main(String[] x)
	{
		Scanner sc=new Scanner(System.in);
		int search = sc.nextInt();
		int len = sc.nextInt();
		int ar[]=new int[len];
		
		for(int i=0;i<len;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.print(binary(ar , 0 , len-1, search));
		
		
		
	}
	
	
	public static int binary(int ar[] , int low , int high , int search)
	{
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(ar[mid]==search)
			return mid;
			
			else
			if(ar[mid]>search)
			return binary(ar , 0 , mid-1, search);
			
			else
			return binary(ar , mid+1 , high, search);
			
		}
		
		return -1;
	}
}