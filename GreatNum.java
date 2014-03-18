import java.io.*;
class GreatNum
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String s[]=st.split(",");
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		if(a>b)
			System.out.println("");
		else if(a<b)
			System.out.println("");
		else
			System.out.println("-1");
		
	}
}