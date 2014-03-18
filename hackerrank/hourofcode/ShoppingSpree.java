import java.util.*;
class ShoppingSpree // name Solution for Submission
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);

		int cheap = 0;
		int x = sc.nextInt();
		for(int i=0;i<x;i++)
			cheap = cheap+a[i];
		System.out.println(cheap);
	}
}