import java.io.*;
class NumAdd 
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int num=Integer.parseInt(st);
		System.out.println(num*(num+1)/2);
	}
}