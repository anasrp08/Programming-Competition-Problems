/*
Have the function SwapII(str) take the str parameter and swap the case of each character. 
Then, if a letter is between two numbers (without separation), switch the places of the two numbers.
For example: if str is "6Hello4 -8World, 7 yes3" the output should be 4hELLO6 -8wORLD, 7 YES3. 
*/
import java.io.*;
class SwapTwo 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		str=str.replace("\"","");
		//str=str.substring(1,str.length()-1);
		StringBuilder res=new StringBuilder("");
		
		int num1 =0,num2=0;

		char result[]=str.toCharArray();
		boolean swap = false , proceed =false;

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);

			

			if(Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch))
				result[i] = Character.toLowerCase(ch);
				
				else
					result[i] = Character.toUpperCase(ch);

			}

			if(ch==' ' && swap == true)
				swap=false;


			if(Character.isDigit(ch))
			{
				if(!swap)
				{
					num1=i;
					//System.out.println(num1);
					swap=true;
				}
				else
				{
					//System.out.println("Hey");
					num2=i;

					swap=false;

					char temp1=' ', temp2 = ' ';

					temp1=str.charAt(num1);
					temp2=str.charAt(num2);
					result[num2] = temp1;
					result[num1] = temp2;

					//System.out.println(result[num2]+" "+result[num1]);

				}

			}
		}
		/*
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i))
			{
				if(swap==0)
					num1=str.charAt(i);
				else
					{
						num2= str.charAt(i);
						swap=1;
					}


			}

			if(swap==1)
			{
				str.replace()		
			}
		}
		*/
		System.out.println(String.valueOf(result));
		
	}
}