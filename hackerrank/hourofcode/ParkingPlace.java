
import java.util.*;
class ParkingPlace // name Solution for Submission
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
		
	long n= sc.nextLong(); // num of space
        
        int m=sc.nextInt(); // already parked
        int k=sc.nextInt(); //park or not
        
        String str="";
        for(int i=0;i<m;i++)
        {
            String t=sc.next();
            str=str.concat(t+" ");
        }
        System.out.println(str);
        
       for(int j=0;j<k;j++)
       {
       		String check = sc.next();
       		if(str.contains(check))
       		{
			System.out.println("1");
       		}
       		else
       			System.out.println("0");
       }
       
   }
}

/*import java.util.*;
class ParkingPlace // name Solution for Submission
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n= sc.nextInt(); // num of space
        
        int m=sc.nextInt();
        int k=sc.nextInt();
        
        int a[] = new int[n+1];
        for(int i=0;i<m;i++)
        {
            int t=sc.nextInt();
            a[t] = 1;
        }
        
        for(int i=0;i<k;i++)
        {
            int t=sc.nextInt();
            System.out.println(a[t]);
        }
	}
}*/
/*
import java.util.*;
class Solution // name Solution for Submission
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		long n= sc.nextLong(); // num of space
        
        int m=sc.nextInt(); // already parked
        int k=sc.nextInt(); //park or not
        
        int a[]=new int[m];
        for(int i=0;i<m;i++)
        {
            int t=sc.nextInt();
            a[i]=t;
        }
        
        for(long i=0;i<k;i++)
        {
        	int check = sc.nextInt();
        	int p = 0;
        	for(int j=0;j<m;j++)
        	{
        		if(a[j]==check)
        		{
        			p=1;
        			System.out.println("1");
        			break;

        		}

        	}

        	if(p==0)
        	{
        		System.out.println("0");
        	}
        }
	}
}*/