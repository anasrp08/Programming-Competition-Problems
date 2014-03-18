import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class tiles
{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());

		int a[]=new int[test];
		int b[]=new int[test];

		for(int k=0;k<test;k++)
		{
			a[k]=Integer.parseInt(br.readLine());
			b[k]=Integer.parseInt(br.readLine());
		}
		int diff=0 , i=0 ,num=0;
		while(test!=0)
		{
			i=a.length-test;
			if(Math.abs(a[i] - b[i]) > diff)
			{
				int res=Math.abs(a[i] - b[i]);
				num=i;
			}

			//code goes here

			test--;
		}
		System.out.println();
	}
}