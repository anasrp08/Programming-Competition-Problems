import java.io.*;
class NumberAdditionTwo 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.replace("\"","");
		
		int sum=0 ,prev=0; double result=0;
		//System.out.println((int) '1');
		double numchar = 0;

		if(Character.isDigit(str.charAt(0)))
		{

			//prev=Character.getNumericValue(str.charAt(0));
			prev = (int)str.charAt(0) -48;
			//System.out.println(prev);

		}

		for(int i=1;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				
					prev=prev * 10 + ((int)str.charAt(i)-48);
					//System.out.println((int)str.charAt(i)-48+" "+prev);

			}

			else
			{
				sum = sum+prev;
				//System.out.println(prev);
				prev=0;
				if(Character.isLetter(str.charAt(i)))
					numchar++;
			}

		}

		sum = sum+prev;//if last digit is not letter

		//to calculate digit sum

		/*int num=sum , dsum=0;

		while(num!=0)
		{
			dsum=dsum+(num%10);
			num=num/10;
		}*/


		result = sum/numchar;

		if(result<0.5)
			System.out.println("0");
		else

		
		

		System.out.println(Math.round(result));
	}
}