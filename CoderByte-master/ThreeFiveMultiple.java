// For this challenge you will be determining the multiples of a specific number.
import java.io.*;
import java.util.*;
class ThreeFiveMultiple
{
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();

	int num = Integer.parseInt(str);
	int sum=0;

	for(int i= 3;i<num;i=i+3)
	{
		if(i%5!=0)
		{
			sum =sum+i;
			System.out.println(i);
		}
	}

	for(int i=5;i<num;i=i+5)
	{
		sum=sum+i;
		System.out.println(i);
	}
	System.out.println(sum);

	
	/*int sum = (num - (num%3) * 3;

	sum = sum + ((num / 5) - (num % 5)) *5;

	while(num/ 15>0)
	{
		num = ((num/15)-(num%15))
	}
	*/	
		
		
	}
}

