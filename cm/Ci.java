import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Ci
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		int num;
		while(test!=0)
		{
			int t=Integer.parseInt(br.readLine());

			if(t%11!=0)
			{
				num=t*2+2;
				if(!check(num))
					num=num+2;
			}
			else {
				num=t*2+20000000;	
			}
			System.out.println(num);

			test--;
		}
	}

	public static boolean check(int num)
	{
		int t=num;
		int d=0;
		while(t!=0)
		{
			d++;
			t=t/10;

		}
		int r=0 ,cn=2;
		while(r<=d)
		{
			int v=t/(int)Math.pow(10,cn);
			if(v%11==0)
			{
				return false;
			}
			else{
				cn++;
				r++;

			}
		}
		return true;

	}
}