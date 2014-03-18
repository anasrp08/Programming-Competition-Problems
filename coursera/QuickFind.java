import java.io.*;
class Demo
{

	private int id[] , n;
	Demo(int n)
	{
		id = new int[n];
		for (int i=0;i<n ;i++ ) {
			id[i] = i;
			this.n=n;
		}
	}

	 boolean isConnected(int p,int q)
	 {
	 	return id[p] == id[q];
	 }

	 void union(int p,int q)
	 {
	 	if(! isConnected(p,q))
	 	{
	 		for(int i=0;i<n;i++)
	 		{
	 			if(id[i] == id[p])
	 			{
	 				id[i] = id[q];
	 			}
	 		}
	 	}

	 }
}

class QuickFind
{

	public static void main(String[] args) throws IOEcxception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		
		do{
			System.out.println("1. isconnected \n 2. union");

			System.out.println("Enter p and q");
			int p = Integer.parseInt(br.readLine());
			int p = Integer.parseInt(br.readLine());


			switch(Integer.parseInt(br.readLine))
			{
				case 1: if(isconnected(p,q))
				System.out.println("Conected");

				else
				System.out.prinltn("Not connected");
				break;
			
				case 2: union(p,q);
				break;

			}
		} while(br.readLine().equalsIgnoreCase("y"));
	}
}