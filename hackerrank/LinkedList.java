import java.io.*;
class LinkedList
{
	public static void main(String[] args) {
		
	}
}

class Data
{
	Data next;
	int n;
}

class Program
{
	Program()
	{

	}

	public void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Data start = null;
		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());
		start = new Data();
		start.n = num;

	}
}