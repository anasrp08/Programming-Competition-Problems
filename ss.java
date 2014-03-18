import java.util.*;
class SdSquare
{
		public static void main(String x[])
		{
				Scanner sc=new Scanner(System.in);
				System.out.println("Test cases");
				int test=sc.nextInt();
				int current=0;
				while(current<test)
				{
						int count=0;
						//System.out.println("Enter a");
						int a=sc.nextInt();
						//System.out.println("Enter b");
						int b=sc.nextInt();
						
						
						int sqa=(int)Math.sqrt(a);
						int sqb=(int)Math.sqrt(b);
						
						int fnum=0;
						if(sqa*sqa==a)
						fnum=sqa;
						else fnum=sqa+1;
						
						
						for(int j=fnum;j<=sqb;j++)
						{
								int k=j*j;
								if(pdigit(k))
								count++;
						}
						System.out.println(count);
						
					current++;
				}
				
		}
		
		/*private static boolean square(int n)
		{
				if((Math.sqrt(n)*100)%100==0)
				return true;
				
				
				return false;
				//return Math.sqrt(n);
		}*/
		
		/*
		private static boolean pdigit(int num)
		{
				while(num!=0)
				{
					int d=num%10;
					if(d!=0 || d!=1 || d!=4 || d!=9)
					return false;
					num=num/10;
				}
				return true;
		}
		*/
		
		private static boolean pdigit(int d)
		{
					//int d=num%10;
					if(d!=0 || d!=1 || d!=4 || d!=9)
					return false;
					//num=num/10;
				return true;
		}
}
