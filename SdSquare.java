import java.util.*;
class SdSquare
{
		public static void main(String x[])
		{
				Scanner sc=new Scanner(System.in);
				//System.out.println("Test cases");
				int test=sc.nextInt();
				int current=0;
				while(current<test)
				{
						int count=0;
						//System.out.println("Enter a");
						int a=sc.nextInt();
						//System.out.println("Enter b");
						long b=sc.nextLong();
						
						
						int sqa=(int)Math.sqrt(a);
						long sqb=(long)Math.sqrt(b);
						
						long fnum=0;
						if(sqa*sqa==a)
						fnum=sqa;
						else fnum=sqa+1;
						
						for(long j=fnum;j<=sqb;j++)
						{
								//if(proceed(j))
								//{
									long k=j*j;
									if(pdigit(k))
									count++;
								//}
						}
						System.out.println(count);
						
					current++;
				}
				
		}
		
		
		public static boolean pdigit(long num)
		{
				/*int t=num%10;
				if(t==6 || t==4 || t==5)
				return false;
				//num=num/10;*/
				while(num!=0)
				{
					long d=num%10;
					if(d!=0 && d!=1 && d!=4 && d!=9)
					return false;
					num=num/10;
				}
				return true;
		}

		public static boolean proceed(long num)
		{


			long t=num%10;
			if(t==6 || t==4 || t==5)
			return false;

			return true;
		}
		
		
		
}
