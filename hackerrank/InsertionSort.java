//Insertin Sort part 1
import java.util.*;
class InsertionSort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int test=sc.nextInt();
		int a[]=new int[test];
		for(int i=0;i<test;i++)
			a[i]=sc.nextInt();
		int j;
		for(int i=1;i<test;i++)
		{
			int temp=a[i];

			for(j=i-1;j>=0 && a[j]>temp;j--)
				a[j+1]=a[j];

			a[j+1]=temp;

			for(int t:a)
			{
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}
}