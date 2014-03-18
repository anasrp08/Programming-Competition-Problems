//For this challenge you will be converting a number from binary to decimal.
import java.io.*;
class BinToDiv
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num=Integer.parseInt(str.substring(1,str.length()-1));
		int res=0 , mul = 1;
		while(num!=0)
		{
			int a=num%10;
			res=res+(a*mul);
			mul=mul*2;
			num=num/10;

		}
		System.out.println(res);

		
	}
}