import java.io.*;
class EqualAmountChar
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int countx =0,counto=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='x')
				countx++;
			if(ch=='o')
				counto++;

			
		}
		if(countx==counto)
		System.out.println("true");
		else
			System.out.println("false");
	}
}