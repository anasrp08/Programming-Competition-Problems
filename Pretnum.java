import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//import java.util.Scanner;
class Pretnum
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		int test=Integer.parseInt(br.readLine());
		//int test=sc.nextInt();
		while(test!=0)
		{
			StringBuffer str=new StringBuffer("");
			StringTokenizer st=new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken());
			long b=Long.parseLong(st.nextToken());
			
			/*int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			*///long b=Long.parseLong(br.readLine());
			/*long a=sc.nextLong();
			long b=sc.nextLong();*/
			int count=0;
			if(a%2==0)
				a++;
			if(a==1 || a==2)
			{
				count++;
				a=3;
			}
	/*		if(a==1)
			{
				//str.append("2 \n");
			
				a=2;
			}
*/
			/*
				*/
			int sqa=(int)Math.sqrt(a);
			/*if(a%sqa!=0 || sqa==1)
			sqa++;
			*/

			int ta=sqa*sqa;
			if(ta<a)
				sqa++;
				//ta=(sqa+1)*(sqa+1);
			int sqb=(int)Math.sqrt(b);
			count=count+(sqb-sqa+1);
			/*for (int l=sqa;l<=sqb ;l++ ) {
				System.out.println(l);
			}*/
			/*int tb=sqb*sqb;
			if(b%sqb!=0)
				sqb--;
			*/

			/*if(a<=5 && b>=5)
				count++;
				*/

				


			for(long i=a;i<=b;i=i+2)
			{
				/*if(sqa*sqa==i || sqa*sqa==i-1)
				{
					//str.append(sqa*sqa + "\n");
					sqa++;
					count++;
				}

				else*/

				/*if(sqa*sqa==i)
				{
					count++;
					sqa++;
				}*/	
				if(prime(i))
					count++;
					//str.append(i+"\n");
			}
			//System.out.print(str);
			System.out.println(count);

			test--;

		}	
	}

	public static boolean prime(long num)
	{

		/*if(num%2==0)
			return false;*/
		/*if(num==5)
			return true;*/
		for(int i=3;i*i<=num;i=i+2)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}