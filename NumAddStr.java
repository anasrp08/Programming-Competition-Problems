import java.io.*;
class NumAddStr 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.replace("\"","");
		
		int sum=0 ,prev=0; float result=0;
		//System.out.println((int) '1');

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
			}

		}

		sum = sum+prev;//if last digit is not letter

		

		System.out.println(sum);
	}
}