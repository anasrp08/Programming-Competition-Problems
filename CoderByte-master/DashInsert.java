import java.io.*;

class DashInsert
{


	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		

		char ch[]= new char[str.length() * 2 +1];

		for(int i=0;i<ch.length ; i++)
		{
			ch[i]='@';
		}


		for(int i=0;i< str.length() ; i++)
			ch[i*2] = str.charAt(i);
		
		for(int i=0;i< str.length()*2 ; i = i+2)
		{
			if(odd(i , ch))
			{
				ch[i+1] = '-';		
			}
			else
			if(even(i,ch))
			{
				ch[i+1] = '*';
			}		
		}
		

		for(int i=0;i< ch.length ; i++)
		{
			if(ch[i] != '@')
				System.out.print(ch[i]);

		}
	}

	public static boolean odd(int i , char ch[])
	{
		char ch1=ch[i];
		char ch2=ch[i+2];

		if((ch1=='1' || ch1=='3' || ch1=='5' || ch1=='7' || ch1=='9' ) && (ch2=='1' || ch2=='3' || ch2=='5' || ch2=='7' || ch2=='9' ))
			return true;

		return false;
	}

	public static boolean even(int i , char ch[])
	{
		char ch1=ch[i];
		char ch2=ch[i+2];

		if((ch1=='2' || ch1=='4' || ch1=='6' || ch1=='8' ) && (ch2=='2' || ch2=='4' || ch2=='6' || ch2=='8' ))
			return true;

		return false;

	}
}