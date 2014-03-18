import java.util.*;
class Cooling
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt(); //test cases
		while(test!=0)
		{
			int npie=sc.nextInt(); //num of pie inputs
			int p[]=new int[npie]; //inputs for pie weight
			int r[]=new int[npie]; //inputs for rack weights
			int v[]=new int[npie]; //visited rack
			for(int j=0;j<npie;j++)
				p[j]=sc.nextInt();


		//	int nrack=sc.nextInt(); //num of rack weight inputs
			
			for(int j=0;j<npie;j++)
				r[j]=sc.nextInt();
			Arrays.sort(p); //4 7 8 9 16
			Arrays.sort(r); //3 8 10 10 14
			int count=0; //result
			for(int i=0;i<npie;i++)
			{
				for(int k=0;k<npie;k++)
				{
					if(p[i]<=r[k])
					{
						count++;
						r[k]=-1;
						break;

					}
				}

			}
			System.out.println(count);



			
		
			test--; //next case
		}
	
	}
}