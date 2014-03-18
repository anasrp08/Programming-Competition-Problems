import java.io.*;
import java.util.*;
class ConvertBin
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		Stack s=new Stack();
		while(num!=0)
		{
			s.push(num%2);
			num=num/2;
		}
		while(s.empty()==false)
		System.out.print(s.pop());
	}
}