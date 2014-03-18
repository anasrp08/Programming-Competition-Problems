import java.io.*;
import java.util.*;
class TripleDouble
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String str=br.readLine();

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int a[] = new int[10];
		int b[] = new int[10];

		boolean proceed=true;
		int d=0 ,ij=0;

		while(num1!=0)
		{
			if(num1%10==d || ij==0)
			{
				
				a[d]++;
			}
			d=num1 % 10;
			num1 = num1 / 10;
			ij++;
		}
		for(int t=0;t<a.length;t++)
		{
			if(a[t]!=0)
				System.out.println(t+" "+a[t]);
		}

		/*for(int t:a)
		{
			if(t!=0)
				System.out.println(t);
		}*/
		d=num2 % 10;
		ij=0;

		while(num2!=0)
		{
			if(num2%10==d || ij==0)
			{

				
				b[d]++;
				ij++;
			}
			d=num2 % 10;
			num2 = num2 / 10;
		}

		for(int t=0;t<b.length;t++)
		{
			if(b[t]!=0)
				System.out.println(t+" "+b[t]);
		}

		int res = 0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==3)
			{
				res = i;
				if(b[i] == 2)
				{
					System.out.println("1");
					proceed=false;
					break;
				}
				
			}
		}

		if(proceed)
			System.out.println("0");

		
		
	}
}

/* Submitted Code  */
/*
import java.util.*; 
import java.io.*;

class Function {  
  int TripleDouble(int num1, int num2) { 


  		int a[] = new int[10];
		int b[] = new int[10];

		int result = 0;

		boolean proceed=true;
        int d=num1%10;

		while(num1!=0)
		{
			if(num1%10==d)
			{
				
				a[d]++;
			}
			d=num1 % 10;
			num1 = num1 / 10;
		}

		
		d=num2 % 10;

		while(num2!=0)
		{
			if(num2%10==d)
			{

				
				b[d]++;
			}
			d=num2 % 10;
			num2 = num2 / 10;
		}


		int res = 0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=3)
			{
				res = i;
				if(b[i] == 2)
				{
					return 1;
					
				}
				
			}
		}

		return 0;
  }      
}

class Main {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.TripleDouble(s.nextLine())); 
    
  }
} 









  
*/

